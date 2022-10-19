package My_Java_Home.Study_LogicalOperation;

import java.util.Scanner;

/**
 * Java课程，学习switch()的使用
 */
public class Week {


    public static void main(String[] args) {

        System.out.println("请输入星期数字:");

        Scanner scan = new Scanner(System.in);

        int week_Number = scan.nextInt();

        switch(week_Number){

            case 1 : System.out.println("您好，您输入的:" + week_Number +"代表星期一");
            break;

            case 2 : System.out.println("您好，您输入的:" + week_Number +"代表星期二");
            break;

            case 3 : System.out.println("您好，您输入的:" + week_Number +"代表星期三");
            break;

            case 4 : System.out.println("您好，您输入的:" + week_Number +"代表星期四");
            break;

            case 5 : System.out.println("您好，您输入的:" + week_Number +"代表星期五");
            break;

            case 6 : System.out.println("您好，您输入的:" + week_Number +"代表星期六");
            break;

            case 7 : System.out.println("您好，您输入的:" + week_Number +"代表星期日");
            break;

            default : System.out.println("输入不合法，请输入1~7范围的整数数字");

        }

    }

}
