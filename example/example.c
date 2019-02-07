/* File : example.c */

#include "example.h"
#include <stdio.h>

static mystruct_t mystruct = { 0 };

void trigger_log(const char * log_message, string_cb_t my_string_cb)
{
    mystruct.value = 1;// malloc(4);
    my_string_cb(log_message, &mystruct);
}

int run_op(int a, int b, op_t my_operator)
{
    int result = my_operator(a, b);
    printf("run_op result: %d\n", result);
    return result;
}
