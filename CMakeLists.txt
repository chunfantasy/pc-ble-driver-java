cmake_minimum_required(VERSION 3.3)

# Name of the project
project (pc-ble-driver-java)

set(PC_BLE_DRIVER_JAVA_OUTDIR ${CMAKE_BINARY_DIR}/outdir)

set(CMAKE_ARCHIVE_OUTPUT_DIRECTORY ${PC_BLE_DRIVER_JAVA_OUTDIR})
set(CMAKE_LIBRARY_OUTPUT_DIRECTORY ${PC_BLE_DRIVER_JAVA_OUTDIR})
set(CMAKE_RUNTIME_OUTPUT_DIRECTORY ${PC_BLE_DRIVER_JAVA_OUTDIR})
set(CMAKE_SWIG_OUTDIR ${PC_BLE_DRIVER_JAVA_OUTDIR})
foreach( OUTPUTCONFIG ${CMAKE_CONFIGURATION_TYPES} )
    string( TOUPPER ${OUTPUTCONFIG} OUTPUTCONFIG )
    set( CMAKE_RUNTIME_OUTPUT_DIRECTORY_${OUTPUTCONFIG} ${PC_BLE_DRIVER_JAVA_OUTDIR} )
    set( CMAKE_LIBRARY_OUTPUT_DIRECTORY_${OUTPUTCONFIG} ${PC_BLE_DRIVER_JAVA_OUTDIR} )
    set( CMAKE_ARCHIVE_OUTPUT_DIRECTORY_${OUTPUTCONFIG} ${PC_BLE_DRIVER_JAVA_OUTDIR} )
endforeach( OUTPUTCONFIG CMAKE_CONFIGURATION_TYPES )

# All projects depending on pc-ble-driver need to include this first
include(pc-ble-driver/cmake/pc-ble-driver.cmake)
add_subdirectory(pc-ble-driver)

# Include folders
include_directories(${PC_BLE_DRIVER_INCLUDE_DIR})

# SWIG
find_package(SWIG REQUIRED)
include(${SWIG_USE_FILE})
message (STATUS "SWIG_USE_FILE=${SWIG_USE_FILE}")
find_package(Java REQUIRED)
include(UseJava)
find_package(JNI REQUIRED)
if (JNI_FOUND)
    message (STATUS "JNI_INCLUDE_DIRS=${JNI_INCLUDE_DIRS}")
    message (STATUS "JNI_LIBRARIES=${JNI_LIBRARIES}")
    message (STATUS "JAVA_HOME=${JAVA_HOME}")
endif()
find_path(JAVA_INCLUDE_PATH jni.h
  ${JAVA_INCLUDE_PATH}
)
include_directories(${JAVA_INCLUDE_PATH})
include_directories(${JAVA_INCLUDE_PATH2})

#find_package(PythonLibs 2.7 REQUIRED)
#include_directories(${PYTHON_INCLUDE_PATH})

foreach(SD_API_VER ${SD_API_VERS})
    set(JAVA_MODULE_${SD_API_VER} ${PC_BLE_DRIVER_${SD_API_VER}_PROJECT_NAME})
endforeach(SD_API_VER)

set(SWIG_I_FILE ${CMAKE_CURRENT_LIST_DIR}/swig/pc_ble_driver.i.in)

# Use release lib of JAVA even when building with DEBUG
#add_definitions( -DSWIG_JAVA_INTERPRETER_NO_DEBUG -DHAVE_ROUND=1)

# Avoid warning on Windows
if(WIN32)
    add_definitions( -DHAVE_ROUND )
endif()

# Copy .i file into N variant files
foreach(SD_API_VER ${SD_API_VERS})
    # Copy SWIG-generated wrapper
    set(SWIG_I_FILE_${SD_API_VER} ${PC_BLE_DRIVER_JAVA_OUTDIR}/${JAVA_MODULE_${SD_API_VER}}.i)
    #MESSAGE( STATUS "swig i: " "${SWIG_I_FILE_${SD_API_VER}}")
    set(SWIG_MODULE_NAME ${JAVA_MODULE_${SD_API_VER}})
    configure_file(${SWIG_I_FILE} ${SWIG_I_FILE_${SD_API_VER}})
    #add_custom_command(OUTPUT ${SWIG_I_FILE_${SD_API_VER}}
    #    COMMAND ${CMAKE_COMMAND} -E copy ${SWIG_I_FILE} ${SWIG_I_FILE_${SD_API_VER}}
    #)
    set_property(SOURCE ${SWIG_I_FILE_${SD_API_VER}} PROPERTY CPLUSPLUS ON)
    #set_property(SOURCE ${SWIG_I_FILE_${SD_API_VER}} APPEND PROPERTY SWIG_FLAGS "-threads")
    set_property(SOURCE ${SWIG_I_FILE_${SD_API_VER}} APPEND PROPERTY SWIG_FLAGS "-DPC_BLE_DRIVER_STATIC")
endforeach(SD_API_VER)


foreach(SD_API_VER ${SD_API_VERS})
    set(SWIG_C_SRC_FILES_${SD_API_VER} ${PC_BLE_DRIVER_JAVA_OUTDIR}/${JAVA_MODULE_${SD_API_VER}}JAVA_wrap.c)
    set_source_files_properties(SWIG_C_SRC_FILES_${SD_API_VER} PROPERTIES LANGUAGE CXX)

    set(CMAKE_SWIG_FLAGS)
    foreach(it ${PC_BLE_DRIVER_${SD_API_VER}_PUBLIC_INCLUDE_DIRS})
        #MESSAGE( STATUS "${SD_API_VER} it: " "${it}" )
      set(CMAKE_SWIG_FLAGS ${CMAKE_SWIG_FLAGS} "-I${it}")
    endforeach()

    string(REGEX MATCH "[0-9]+$" _SD_API_VER_NUM "${SD_API_VER}")
    set(SD_API_VER_COMPILER_DEF_NUM "-D${SD_API_VER_COMPILER_DEF}=${_SD_API_VER_NUM}")
    set(CMAKE_SWIG_FLAGS ${CMAKE_SWIG_FLAGS} "${SD_API_VER_COMPILER_DEF_NUM}")

    swig_add_module(${JAVA_MODULE_${SD_API_VER}} java ${SWIG_I_FILE_${SD_API_VER}})
    target_include_directories(${SWIG_MODULE_${JAVA_MODULE_${SD_API_VER}}_REAL_NAME} PRIVATE ${PC_BLE_DRIVER_${SD_API_VER}_PUBLIC_INCLUDE_DIRS})
endforeach(SD_API_VER)


# These are the files required for the pc_ble_driver Python module:

# Windows
# pc_ble_driver_<variant>.py
# _pc_ble_driver_<variant>.pyd
# pc_ble_driver_<variant>_shared.dll

# Linux
# pc_ble_driver_<variant>.py
# _pc_ble_driver_<variant>.so
# libpc_ble_driver_<variant>_shared.so

# macOS / OS X
# pc_ble_driver_<variant>.py
# _pc_ble_driver_<variant>.so
# libpc_ble_driver_<variant>_shared.dylib

foreach(SD_API_VER ${SD_API_VERS})
    swig_link_libraries(${JAVA_MODULE_${SD_API_VER}} ${JAVA_LIBRARIES} ${PC_BLE_DRIVER_${SD_API_VER}_SHARED_LIB})
endforeach(SD_API_VER)

set(JAVA_PACKAGE_DIR ${CMAKE_CURRENT_LIST_DIR}/java)
set(JAVA_MODULE_DIR ${JAVA_PACKAGE_DIR}/pc_ble_driver_java)
set(JAVA_MODULE_HEX_DIR ${JAVA_MODULE_DIR}/hex)

if(WIN32)
    set(JAVA_MODULE_SHARED_LIB_DIR ${JAVA_MODULE_DIR}/lib/win/x86_${ARCH_BITS})
    set(SWIG_WRAPPER_SHARED_LIB_EXT dll)
elseif(APPLE)
    set(JAVA_MODULE_SHARED_LIB_DIR ${JAVA_MODULE_DIR}/lib/macos_osx)
    set(SWIG_WRAPPER_SHARED_LIB_EXT so)
else()
    set(JAVA_MODULE_SHARED_LIB_DIR ${JAVA_MODULE_DIR}/lib/linux/x86_${ARCH_BITS})
    set(SWIG_WRAPPER_SHARED_LIB_EXT so)
endif()

set(JAVA_MODULE_BUILD_INFO build_info.txt)
set(JAVA_MODULE_BUILD_INFO_PRE_PATH ${PC_BLE_DRIVER_JAVA_OUTDIR}/${JAVA_MODULE_BUILD_INFO})
set(JAVA_MODULE_BUILD_INFO_POST_PATH ${JAVA_MODULE_SHARED_LIB_DIR}/${JAVA_MODULE_BUILD_INFO})

foreach(SD_API_VER ${SD_API_VERS})

    set(SWIG_WRAPPER_${SD_API_VER}_JAVA_FILE ${JAVA_MODULE_${SD_API_VER}}.java)
    set(SWIG_WRAPPER_${SD_API_VER}_JAVA_PATH ${PC_BLE_DRIVER_JAVA_OUTDIR}/${SWIG_WRAPPER_${SD_API_VER}_JAVA_FILE})

    #set(SWIG_WRAPPER_${SD_API_VER}_SHARED_LIB_FILE _${JAV_MODULE_${SD_API_VER}}.${SWIG_WRAPPER_SHARED_LIB_EXT})
    #set(SWIG_WRAPPER_${SD_API_VER}_SHARED_LIB_PATH ${PC_BLE_DRIVER_JAVA_OUTDIR}/${SWIG_WRAPPER_${SD_API_VER}_SHARED_LIB_FILE})

    set(PC_BLE_DRIVER_${SD_API_VER}_SHARED_LIB_FILE ${CMAKE_SHARED_LIBRARY_PREFIX}${PC_BLE_DRIVER_${SD_API_VER}_SHARED_LIB}${CMAKE_SHARED_LIBRARY_SUFFIX})
    set(PC_BLE_DRIVER_${SD_API_VER}_SHARED_LIB_PATH ${PC_BLE_DRIVER_JAVA_OUTDIR}/${PC_BLE_DRIVER_${SD_API_VER}_SHARED_LIB_FILE})

    # Copy SWIG-generated .java wrapper
    #add_custom_command(TARGET ${SWIG_MODULE_${JAVA_MODULE_${SD_API_VER}}_REAL_NAME} POST_BUILD
    #    COMMAND ${CMAKE_COMMAND} -E copy ${SWIG_WRAPPER_${SD_API_VER}_JAVA_PATH} ${JAVA_MODULE_SHARED_LIB_DIR}
    #)

    # Copy SWIG wrapper lib
    #add_custom_command(TARGET ${SWIG_MODULE_${JAVA_MODULE_${SD_API_VER}}_REAL_NAME} POST_BUILD
    #    COMMAND ${CMAKE_COMMAND} -E copy ${SWIG_WRAPPER_${SD_API_VER}_SHARED_LIB_PATH} ${JAVA_MODULE_SHARED_LIB_DIR}
    #)

    # Copy DLL
    #add_custom_command(TARGET ${SWIG_MODULE_${JAVA_MODULE_${SD_API_VER}}_REAL_NAME} POST_BUILD
    #    COMMAND ${CMAKE_COMMAND} -E copy ${PC_BLE_DRIVER_${SD_API_VER}_SHARED_LIB_PATH} ${JAVA_MODULE_SHARED_LIB_DIR}
    #)

    # Copy .hex files
    #add_custom_command(TARGET ${SWIG_MODULE_${JAVA_MODULE_${SD_API_VER}}_REAL_NAME} POST_BUILD
    #    COMMAND ${CMAKE_COMMAND} -E copy_directory ${PC_BLE_DRIVER_HEX_DIR}/${SD_API_VER} ${JAVA_MODULE_HEX_DIR}/${SD_API_VER}
    #)
endforeach(SD_API_VER)

# Generate build information file
set(BUILD_INFO "Build information:\n")

build_metadata(${CMAKE_CURRENT_LIST_DIR} BUILD_MD_STRING)
string(CONCAT BUILD_INFO ${BUILD_INFO} ${BUILD_MD_STRING} )
string(CONCAT BUILD_INFO ${BUILD_INFO} "* SWIG version: " ${SWIG_VERSION} "\n")
#string(CONCAT BUILD_INFO ${BUILD_INFO} "* Pyhon version: " ${PYTHONLIBS_VERSION_STRING} "\n")
#string(CONCAT BUILD_INFO ${BUILD_INFO} "* Pyhon libs: " ${PYTHON_LIBRARIES} "\n")
git_repo_metadata(${CMAKE_CURRENT_LIST_DIR} JAVA_GIT_COMMIT JAVA_GIT_BRANCH JAVA_GIT_REMOTES)
string(CONCAT BUILD_INFO ${BUILD_INFO} "* Git repo: " ${PROJECT_NAME} "\n")
string(CONCAT BUILD_INFO ${BUILD_INFO} "** Git revision: " ${JAVA_GIT_COMMIT} "\n")
string(CONCAT BUILD_INFO ${BUILD_INFO} "** Git branch: " ${JAVA_GIT_BRANCH} "\n")
git_repo_metadata(${PC_BLE_DRIVER_ROOT_DIR} DRIVER_GIT_COMMIT DRIVER_GIT_BRANCH DRIVER_GIT_REMOTES)
string(CONCAT BUILD_INFO ${BUILD_INFO} "* Git repo: " "pc-ble-driver" "\n")
string(CONCAT BUILD_INFO ${BUILD_INFO} "** Git revision: " ${DRIVER_GIT_COMMIT} "\n")
string(CONCAT BUILD_INFO ${BUILD_INFO} "** Git branch: " ${DRIVER_GIT_BRANCH} "\n")

file(WRITE ${JAVA_MODULE_BUILD_INFO_PRE_PATH} ${BUILD_INFO})

# iterate to count-1
math(EXPR _COUNT "${SD_API_VER_COUNT} - 1")
# Post-build build info
foreach(i RANGE ${_COUNT})
    list(GET SD_API_VERS ${i} SD_API_VER)

    # copy the build info only once, on the first iteration
    if(${i} EQUAL 0)
        #add_custom_command(TARGET ${SWIG_MODULE_${JAVA_MODULE_${SD_API_VER}}_REAL_NAME} POST_BUILD
        #    COMMAND ${CMAKE_COMMAND} -E copy ${JAVA_MODULE_BUILD_INFO_PRE_PATH} ${JAVA_MODULE_BUILD_INFO_POST_PATH}
        #    COMMAND ${CMAKE_COMMAND} -E echo "* MD5 sums: " >> ${JAVA_MODULE_BUILD_INFO_POST_PATH}
        #)
    endif()

    #add_custom_command(TARGET ${SWIG_MODULE_${JAVA_MODULE_${SD_API_VER}}_REAL_NAME} POST_BUILD
    #    COMMAND ${CMAKE_COMMAND} -E echo_append "** " >> ${JAVA_MODULE_BUILD_INFO_POST_PATH}
    #    COMMAND ${CMAKE_COMMAND} -E md5sum ${SWIG_WRAPPER_${SD_API_VER}_JAVA_FILE} >> ${JAVA_MODULE_BUILD_INFO_POST_PATH} WORKING_DIRECTORY ${JAVA_MODULE_SHARED_LIB_DIR}
    #    COMMAND ${CMAKE_COMMAND} -E echo_append "** " >> ${JAVA_MODULE_BUILD_INFO_POST_PATH}
    #    #COMMAND ${CMAKE_COMMAND} -E md5sum ${SWIG_WRAPPER_${SD_API_VER}_SHARED_LIB_FILE} >> ${JAVA_MODULE_BUILD_INFO_POST_PATH} WORKING_DIRECTORY ${JAVA_MODULE_SHARED_LIB_DIR}
    #    COMMAND ${CMAKE_COMMAND} -E echo_append "** " >> ${JAVA_MODULE_BUILD_INFO_POST_PATH}
    #    COMMAND ${CMAKE_COMMAND} -E md5sum ${PC_BLE_DRIVER_${SD_API_VER}_SHARED_LIB_FILE} >> ${JAVA_MODULE_BUILD_INFO_POST_PATH} WORKING_DIRECTORY ${JAVA_MODULE_SHARED_LIB_DIR}
    #)
endforeach(i)
