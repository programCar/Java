package My_Java_Home.Study_LoopStatement;

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
