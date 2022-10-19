package My_Java_Home.Study_ConditionalOperator;

import java.util.Scanner;

/**
 * Java课程，课后习题，条件运算符的学习
 * 条件运算符是三目运算符,他是Java中唯一一个三目运算符
 */
public class ThreeNumber_MaxOrMin {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("请输入第一个整数数字:");

        int first_Number = scan.nextInt();

        System.out.println("请输入第二个整数数字:");

        int second_Number = scan.nextInt();

        System.out.println("请输入第三个整数数字:");

        int third_Number = scan.nextInt();

        /**
         * 使用条件运算符计算，先对比first_Number和second_Number谁比较大
         *
         * 如果是first_Number大，则拿first_Number跟third_Number比较谁大，得出最终最大者赋值给max_Number
         *
         * 如果是second_Number大，则拿second_number跟third_Number比较谁大,得出最终最大者赋值给max_Number
         */
        int max_Number = first_Number > second_Number ? (first_Number > third_Number ? first_Number : third_Number) :
                (second_Number > third_Number ? second_Number :third_Number);

        /**
         * 使用条件运算符计算，先对比first_Number和second_Number谁比较小
         *
         * 如果是first_Number小，则拿first_Number跟third_Number比较谁小，得出最终最小者赋值给min_Number
         *
         * 如果是second_Number小，则拿second_number跟third_Number比较谁小,得出最终最小者赋值给min_Number
         */
        int min_Number = first_Number < second_Number ? (first_Number < third_Number ? first_Number : third_Number) :
                (second_Number < third_Number ? second_Number :third_Number);

        System.out.println("您好，您输入的:" + first_Number +"\t"+ second_Number +"\t"+ third_Number +"\t"+
                "其中最大值为:" + max_Number + "最小值为:" + min_Number);

    }

}
