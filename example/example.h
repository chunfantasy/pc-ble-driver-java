#pragma once

#include <Windows.h>

typedef struct
{
    //void * value;
    int value;
    int length;
    unsigned char * name;
    unsigned char address[20];
} mystruct_t;

typedef int (*op_t)(int num_a, int num_b);
typedef void(*string_cb_t)(const char * message, mystruct_t* mystruct);

void trigger_log(const char * message, string_cb_t str_callback);
int run_op(int a, int b, op_t my_operator);
