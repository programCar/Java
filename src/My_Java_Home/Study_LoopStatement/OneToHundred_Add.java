package My_Java_Home.Study_LoopStatement;

/**
 * Java课程。课后练习，while循环的学习（求1~100的和）
 * while循环，如果循环条件为true，则执行循环体内的语句，如果为false则退出循环
 * while循环适合在不知道终止条件的环境下使用
 */
public class OneToHundred_Add {


    public static void main(String[] args) {

        //用于累加计算
        int sum = 0;

        int i = 1;

        //实现从1加到100的操作
        while (i <= 100){

            sum += i;

            i++;

        }

        System.out.println("从一加到100的结果为:" + sum);

    }

}
