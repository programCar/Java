package My_Java_Home.Study_IfElseAndLogicalOperation;

import java.util.Scanner;

/**
 * Java课程，课后习题，逻辑语句的学习（输入一个年份，判断是否为闰年）
 * &&是短路逻辑运算符与，||是短路逻辑运算符或，！是逻辑运算符非
 * &是逻辑运算符与，|是逻辑运算符或
 * 区别:
 * &&短路运算，一旦一端为假，另一端则不参与计算，&不是短路运算，就算一端为假，另一端也参与计算
 * ||短路运算，一旦一端为真，另一端则不参与计算，|不是短路计算，就是一端为真，另一端也参与计算
 * 逻辑运算符是二目运算符
 */
public class Leap_Year {


    public static void main(String[] args) {

        System.out.println("您好!!请输入您想要知道的年份:");

        Scanner scan = new Scanner(System.in);

        int enter_Year = scan.nextInt();

        if (((enter_Year % 100 != 0) && (enter_Year % 4 == 0)) || enter_Year % 400 == 0){

            System.out.println("您好，您输入的:" + enter_Year + "年，是闰年!!");

        }else {

            System.out.println("您好，您输入的:" + enter_Year + "年，不是闰年!!");

        }

    }

}
