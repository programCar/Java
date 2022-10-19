package My_Java_Home;

import java.util.Scanner;

public class Student_Score {


    public static void main(String[] args) {

        System.out.println("请输入您想要知道等级的成绩");

        Scanner scan = new Scanner(System.in);

        int score = scan.nextInt();

        char grade;

        if (score > 100 || score < 0){

            System.out.println("输入不合法，成绩必须是0~100之间");

            return;

        } else if (score >= 90){

            grade = 'A';

        }else if (score >= 80){

            grade = 'B';

        }else if (score >= 70){

            grade = 'C';

        }else if (score >= 60){

            grade = 'D';

        }else {

            grade = 'E';

        }

        System.out.println("您好，您输入的:" + score +"等级为:" +grade);

    }

}
