package My_Java_Home.Study_Recursion;

import java.util.Scanner;

/**
 * Java课程，课后练习，递归的学习(斐波那契，递归实现)
 * 递归（自我理解）:从未来推向现在，然后回溯，依次得到结果
 */
public class Fibonacci_Recursion {

    //定义斐波那契数的第一位数值为0
    static int fibonacci_First = 0;

    //定义斐波那契数的第二位数值为1
    static int fibonacci_Second = 1;


    public static void main(String[] args) {

        //用于储存用户想要知道多少个斐波那契数数值的数量
        int enter_Number;


        System.out.println("请输入您想要知道的斐波那契数量，从斐波那契数的第一位开始");

        Scanner scan = new Scanner(System.in);

        enter_Number = scan.nextInt();

        //输出用户想要的结果
        Print_Owner_Fibonacci(enter_Number);

    }


    /**
     * @Title Print_Owner_Fibonacci
     * @param  enter_Number
     * @return void
     * 此方法用于输出用户想要知道的斐波那契数的数值，从第一位斐波那契数开始输出
     */
    public static void Print_Owner_Fibonacci(int enter_Number){

        //连续输出enter_Number位斐波那契数的数值
        for (int i = 1; i <= enter_Number; i++){

            //输出第i位斐波那契数的数值
            System.out.print("第" + i + "位 :" + Fibonacci_Recursion_Means(i) + "    ");

            //每输出五个斐波那契数的数值就换行一次
            if (i%5 == 0){

                System.out.println();

            }

        }

    }


    /**
     * @Title Fibonacci_Recursion_Means
     * @param ordinal
     * @return int
     * 此方法采用递归形式，用于获取第ordinal位斐波那契数的数值
     */
    public static int Fibonacci_Recursion_Means(int ordinal){

        //如果只想知道第一位斐波那契数的数值，则不参与计算，直接返回开始第一位斐波那契数的数值
        if (ordinal == 1){

            return fibonacci_First;

        }

        //如果只想知道第二位斐波那契数的数值，则不参与计算，直接返回开始第二位斐波那契数的数值
        if (ordinal == 2){

            return fibonacci_Second;
        }

        //否则就进入递归，获取第ordinal位斐波那契数的数值
        return Fibonacci_Recursion_Means(ordinal-1) + Fibonacci_Recursion_Means(ordinal-2);

    }

}
