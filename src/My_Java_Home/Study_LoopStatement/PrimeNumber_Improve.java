package My_Java_Home.Study_LoopStatement;

import java.util.Scanner;

/**
 * Java课程，课后习题，判断一个数字是不是素数(改进)
 * 先分析素数的特点，素数只能被1和它本身0整除
 * 分析判断一个不是素数的过程的数学规律，如9，9分别除以2，3，4，5，6，7，8
 * 发现只要素数不能被它本身的根号值以内的正整数整除就是素数，否则则不是
 * 解决思路；设一个for循环，从数字2开始递增一直到输入数值的根号值，看看这个数值能不能被这个范围内的每一个正整数整除
 * 如果能，则告知用户这个数值不是素数，结束运算，如果不能则继续循环，直到循环结束
 * 循环结束则说明这个数值不能被for范围内的任何一个正整数整数，是素数，输出告诉用户，这个数值是素数
 */
public class PrimeNumber_Improve {


    public static void main(String[] args) {

        System.out.println("请输入一个数字:");

        Scanner scan = new Scanner(System.in);

        int prime_Number = scan.nextInt();

        //判断输入的数字是不是小于等于1的数值，如果是，则不合法，告诉用户，让用户重新输入，提高程序健壮性
        while (prime_Number <= 1){

            System.out.println("输入不合法，输入的数字必须大于1，请重新输入");

            prime_Number = scan.nextInt();

        }

        //实现判断素数的实现思路
        for (int i = 2; i <= Math.sqrt(prime_Number); i++){

            if (prime_Number % i == 0){

                System.out.println("您好，您输入的:" + prime_Number + "数字，不是素数");

                return;

            }

        }

        System.out.println("您好，您输入的:" + prime_Number + "数字，是素数");

    }

}
