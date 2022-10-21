package My_Java_Home.Study_LoopStatement;

import java.util.Scanner;

/**
 * Java课程，课后练习，for循环的学习(n的阶乘)
 * for(初始化变量；循环条件；递增或者递减表达式)
 * for循环适合用于循环终止条件已知的环境条件下使用
 */
public class Factorial {


    public static void main(String[] args) {

        System.out.println("请输入您想要知道几阶阶乘:");

        Scanner scan = new Scanner(System.in);

        int factorial_Number = scan.nextInt();

        //用于阶乘的数值的累计，因为零乘以任何值都为0，所以初始化为1
        long factorial_Sum = 1;

        //计算factorial_Number阶的阶乘
        for (int i = 1; i <= factorial_Number; i++){

            factorial_Sum *= i;

        }

        System.out.println(factorial_Number + "的阶乘为:" + factorial_Sum);
    }
}
