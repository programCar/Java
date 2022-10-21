package My_Java_Home.Study_DataByte;

/**
 * Java课程,课后习题，基本数据类型转换（基本数据类型转换）
 * byte->short->char->int->long->float->double
 * 总结:Java基本数据类型的转换方向可以是，根据基本数据类型所占内存的大小，从小到大转换
 * 基本数据类型的转换，需要用到()，然后把要转为数据类型写进()中，如（int）'A'
 * 显式数据类型转换: int a = (int)'A'  隐式数据类型转换: int a = 'A'
 * 总结:显式基本数据类型转换和隐式基本数据类型转换的结果一样
 * 假如转换的方向是从大到小，假如是显示的数据类型转换就会丢失数据，假如是隐式的数据类型转换则会出现警告(不推荐)
 * 特别注意，Java的布尔数据类型不能转换为其他任何一种数据类型，且任何一种数据类型也不能转换为布尔数据类型
 */
public class Convert_BasicDataByte {


    public static void main(String[] args) {

        //隐式的基本数据类型转换，初始化
        int a = 'A';

        //显示的基本数据类型转换，初始化
        int b = (int)'A';

        //基本数据类型转换，赋值
        int c = 10;

        long e = c;

        //基本数据类型转换，按照数据类型内存占比，从大到小转换
        byte d = (byte)200;

        //int f = (int)false;会警告

        //boolean e = (boolean)4;会警告

        System.out.println(a);

        System.out.println(b);

        System.out.println(e);

        System.out.println(d);

    }
}
