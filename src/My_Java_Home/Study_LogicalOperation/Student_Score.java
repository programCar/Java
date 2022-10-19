package My_Java_Home.Study_LogicalOperation;

import java.util.Scanner;

/**
 * Java课程，课后习题，判断语句（分支语句）的学习和逻辑运算符的掌握
 * Java的判断语句if()括号里面的值跟C语言的不一样，C语言中的是0是假，1是真，但Java不能是0，1判断
 * Java的判断语句if()括号里面只能是布尔变量true和false，true代表真，false代表假
 * 特别注意:&&和||是短路计算，&&只要一端为假，则另一端不进行运算，||只要一端为真，则另一端不参与运算
 */
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
