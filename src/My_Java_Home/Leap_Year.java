package My_Java_Home;

import java.util.Scanner;

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
