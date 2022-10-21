package My_Java_Home.Study_LoopStatement;

import java.util.Scanner;

/**
 * Java课程,课后习题,对课后习题--求一个整数因子（Divisor类）的改进
 * Divisor类的缺点:
 * 时间复杂度太高，时间复杂度为 log n
 * 经过课后对求一个整数因子的数学规律研究发现，除0和1外，任何一个整数都有两个因子，一个是1，另一个是他本身，并且它的因子数值范围只能在它本身数值的1/2范围内
 * 也就是说，Divisor类中这样的算法在运行时，做了大量无用功，所以以此提出改进
 * 而且Divisor类不够健壮，对于非法输入没有抵抗力
 * 解决思路:
 * 先对输入的数值进行一个判断，如果检查到输入的数值小于或者等于0，则提醒用户，并且让用户重新输入，直到用户输入合法数据为止
 * 如果用户输入的数值是1，则直接输出它的因子是1，如果输入的数值大于1，则进入for循环判断，for的循环次数为输入数值的1/2大小，从一开始依次判断哪一个数字能
 * 将输入的数值整除，如果能，则输出这个数字。
 * 在for循环结束后，再输出这个数值的本身。
 */
public class Divisor_Improve {


    public static void main(String[] args) {

        System.out.println("请输入一个数字:");

        Scanner scan = new Scanner(System.in);

        int divisor_Number = scan.nextInt();

        while (divisor_Number <= 0){

            System.out.println("输入不合法，输入的数值必须大于0，请重新输入:");

            divisor_Number = scan.nextInt();

        }

        if (divisor_Number == 1){

            System.out.println("您好，您输入的:" + divisor_Number + "数值的因子是:" + 1);

            return;

        }

        System.out.printf("您好，您输入的:" + divisor_Number + "数值的因子是:");

        for (int i = 1; i <= divisor_Number / 2; i++){

            if (divisor_Number % i == 0){

                System.out.printf(i + "\t");

            }
        }

        System.out.print(divisor_Number);

    }

}
