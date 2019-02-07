using System;
using System.Runtime.InteropServices;

[UnmanagedFunctionPointer(CallingConvention.Cdecl)]
public delegate int OP_CALLBACK(int a, int b);

[UnmanagedFunctionPointer(CallingConvention.Cdecl)]
public delegate void STR_CALLBACK(string message, IntPtr mystruct);

public class runme
{
    static OP_CALLBACK addop = add;
    static OP_CALLBACK mulop = mul;
    static STR_CALLBACK strcb = string_callback;

    static void Main()
    {
        example.trigger_log("Swig test, ok\n", string_callback);

        example.run_op(42, 73, add);
        example.run_op(42, 73, mul);

        Console.ReadLine();
    }

    static int add(int a, int b)
    {
        return a + b;
    }

    static int mul(int a, int b)
    {
        return a * b;
    }

    static void string_callback(string message, IntPtr mystruct)
    {
        Console.WriteLine(message);
        mystruct_t myst = new mystruct_t(mystruct, true);
        Console.WriteLine("mystruct.value: {0}", myst.value);
    }
}
