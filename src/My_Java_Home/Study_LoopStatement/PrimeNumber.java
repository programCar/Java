package My_Java_Home.Study_LoopStatement;

import java.util.Scanner;

/**
 * Java课程，课内学习，break的学习(判断一个整数是否是素数)
 * break关键字，用于结束整个循环体
 */
public class PrimeNumber {


    public static void main(String[] args) {

        System.out.println("请输入一个整数");

        int num = new Scanner(System.in).nextInt();

        boolean flag;

        flag = true;

        for (int i = 2; i < Math.sqrt(num)+1; i++){

            if (num % i == 0){
                flag = false;
                break;
            }
        }

        if (flag){
            System.out.println(num + "是素数");
        }else {
            System.out.println(num + "不是素数");
        }

    }

}
