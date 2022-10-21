package My_Java_Home.Study_ArithmeticOperator;

import java.util.Scanner;

/**
 * Java课程，课后练习，do...while（）的学习(求两个正整数的最大公约数和最小公倍数)
 * do...while（）先执行循环体，再进行循环条件判断
 */
public class Min_CMultipleAndMAX_CFactor {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("请输入第一整数:");

        int first_IntNumber = scan.nextInt();

        System.out.println("请输入第二个整数:");

        int second_IntNumber = scan.nextInt();

        //a, b, c三个变量用于数学计算，获取两个整数间的最小公倍数
        int a, b, c;

        a = first_IntNumber;

        b = second_IntNumber;

        //经过数学计算，获取两个整数间的最小公倍数,最终会将最小公倍数储存在变量a中
        do{

            c = a % b;

            a = b;

            b = c;

        }while (c != 0);

        int min_CommonFactor = a;

        //获取最大公约数，数学计算公式为:两整数相乘最后除以它们两之间的最小公倍数得出
        int max_CommonMultiple = first_IntNumber * second_IntNumber / min_CommonFactor;

        System.out.println(first_IntNumber + "和" + second_IntNumber + "的最大公约数是:" + max_CommonMultiple);

        System.out.println(first_IntNumber + "和" + second_IntNumber + "的最小公倍数是:" + min_CommonFactor);



    }
}
