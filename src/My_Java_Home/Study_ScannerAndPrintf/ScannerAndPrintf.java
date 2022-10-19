package My_Java_Home.Study_ScannerAndPrintf;

import java.util.Scanner;

/**
 * Java课程，课后习题,输入输出的学习
 *
 * Java的输出类似于C语言的输出，但Java的输出是System.out.printf();
 * Java的输出有两种，System.out.println();  System.out.printf();
 * 区别:
 * 第一种默认输出后换行且可以不带参数，第二张输出后不自动换行且必须带参数
 * 第一种不可以使用（格式控制部分，表达式1，表达式2...）;的输出形式，会警告
 *
 * Java的输出可以类似于C语言:System.out.println(格式控制部分，表达式1，表达式2......);
 * Java的输出也可以是使用并指符号"+"将变量、表达式、或者一个常熟或者一个字符，并置输出
 *
 * Java的输入要用到java包下的util子包中的Scanner类，通过Scanner类创建一个输入的类对象，如Scanner scan = new Scanner(System.in);
 * 通过scan对象调用各种输入方法，读取用户在命令行输入的各种数据类型的值
 * 使用Scanner类需要导包，如import java.util.Scanner;
 */
public class ScannerAndPrintf {


    public static void main(String[] args) {

        byte a;

        int b;

        float c;

        double d;

        Scanner scan = new Scanner(System.in);

        a = scan.nextByte();

        b = scan.nextInt();

        c = scan.nextFloat();

        d = scan.nextDouble();

        System.out.println();

        //System.out.print();会警告

        System.out.printf("a = %d, b = %4d, c = %5.2f, d = %f\n",a,b,c,d);

        System.out.printf("a = " + a + "b = " + b + "c = " + c + "d = " + d);

        System.out.println();

        System.out.println("a = " + a + "b = " + b + "c = " + c + "d = " + d);

        //System.out.println("a = %d, b = %4d, c = %5.2f, d = %f\n",a,b,c,d);会警告

    }

}
