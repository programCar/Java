package My_Java_Home;

import java.util.Scanner;


/**
 *@author ZengYuanQuan(programCar)
 */



public class Fibonacci_Recurrence {


    public static void main(String[] args) {


        int enter_Number;                                       //用于储存用户想要知道多少个斐波那契数数值的数量


        System.out.println("请输入您想要知道的斐波那契数量，从斐波那契数的第一位开始");


        Scanner scan = new Scanner(System.in);


        enter_Number = scan.nextInt();


        Print_Owner_Fibonacci(enter_Number);                    //输出用户想要的结果


    }


    /**
     * @Title Print_Owner_Fibonacci
     * @param enter_Number
     * @return void
     * 此方法用于输出用户想要知道的斐波那契数的数值，从第一位斐波那契数开始输出
     */


    public static void Print_Owner_Fibonacci(int enter_Number){


        for (int i = 1; i <= enter_Number; i++){                                        //连续输出enter_Number位斐波那契数的数值

            System.out.print("第" + i + "位 :" + Fibonacci_Recurrence_Means(i) + "    ");//输出第i位斐波那契数的数值

            if (i%5 == 0){                                                              //每输出五个斐波那契数的数值就换行一次

                System.out.println();

            }

        }


    }


    /**
     * @Title Fibonacci_Recurrence_Means
     * @param ordinal
     * @return int
     * 此方法采用递推形式，用于获取第ordinal位斐波那契数的数值
     */


    public static int Fibonacci_Recurrence_Means(int ordinal) {

        int fibonacci_First = 0;                                //用于储存相对位置为第一位斐波那契数的数值，并且设定开始第一位斐波那契数的数值为0


        int fibonacci_Second = 1;                               //用于储存相对位置为第二位斐波那契数的数值，并且设定开始第二位的斐波那契数的数值为1


        int fibonacci_Next = 0;                                 //用于储存相对位置为第三位斐波那契数的数值。


        if (ordinal == 1) {                                     //如果只想知道第一位斐波那契数的数值，则不参与计算，直接返回开始第一位斐波那契数的数值

            return fibonacci_First;
        }


        if (ordinal == 2) {                                     //如果只想知道第二位斐波那契数的数值，则不参与计算，直接返回开始第二位斐波那契数的数值

            return fibonacci_Second;
        }


        for (int i = 3; i <= ordinal; i++) {                    //实现斐波那契数的数值之间的逻辑关系

            fibonacci_Next = fibonacci_First + fibonacci_Second;

            fibonacci_First = fibonacci_Second;

            fibonacci_Second = fibonacci_Next;

        }


        return  fibonacci_Next;                                 //返回相对位置为第三位斐波那契数的数值


    }


}
