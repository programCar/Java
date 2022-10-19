package My_Java_Home.Study_DataByte;

/**
 * Java课程，课后习题，数据类型的学习
 * 特别注意的地方，float类型的变量数值后面必须带f或者F标识，如果一个浮点数不带此类标识，则会默认为double类型
 * double类型的数值后面可以带d或者D或者不带，不带则默认为double类型.
 */
public class DataByte {


    public static void main(String[] args) {

        //定义双精度类型常量PI，初始化值为3.1415926，final代表最终形态，不可更改
        final double PI = 3.1415926;

        //定义一个字节类型变量a，初始化值为0，内存为1字节，取值范围为-128~127
        byte a = 0;

        //定义一个整型类型变量b，初始化值为100，内存为4字节，取值范围为-32768~32767
        int b = 100;

        //定义一个字符类型变量从，初始化值为'A,内存为1字节'
        char c = 'A';

        //定义一个双精度类型变量d，初始化值为2.5，内存为8字节
        double d = 2.5d;

        //定义一个单精度类型变量e，初始化值为2.5，内存为4字节，float类型的数值后面必须带f，不带则默认为double类型变量
        float e = 2.5f;

        //定义一个字节类型变量a1，并且给a1变量赋值为10
        byte a1;

        a1 = 10;

    }

}
