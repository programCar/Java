package My_Java_Home.Study_LoopStatement;

import java.util.Scanner;

/**
 * Java课程，课后习题，continue关键字的练习(求一个整数因子)
 * continue的作用:用来结束本次循环，跳出本循环体中下面尚未执行的语句，接着进行终止条件的判断，以决定是否继续循环
 * 总结实现思想:
 * 从一开始到输入的数值结束，让这个范围的每一个数字按顺序跟输入的数字整除。如果可以被整除则输出这个数字，如果不能，则使用continue跳过，继续进入下一轮判断循环
 */
public class Divisor {


    public static void main(String[] args) {

        System.out.println("请输入一个整数");

        int int_Number = new Scanner(System.in).nextInt();

        System.out.println("整数" + int_Number + "的因子");

        for (int i = 1; i <= int_Number; i++){

            if (int_Number % i != 0)
                continue;
            System.out.print(i + ",");
        }


    }

}
