package My_Java_Home.Study_PackageAndImport;

import java.util.Scanner;

/**
 * Java课程,课后习题,对package语句和import语句的学习使用(求圆的周长和面积)
 * 此类在My_Java_Home包的Study_PackageAndImport包中
 * 此类导入了java包中子包util中的Scanner类
 * 此类还使用了Math类中的静态变量PI和静态方法pow()
 */
public class Circle_PerimeterAndArea {


    public static void main(String[] args) {

        //获取Π的数值，用于后期圆的面积和周长数学公式计算
        final double PI = Math.PI;

        System.out.println("请输入圆的半径数值:");

        Scanner scan = new Scanner(System.in);

        //获取圆的半径长度
        double  r = scan.nextDouble();

        //对输入的半径数值判断，提高程序健壮性
        while (r <= 0){

            System.out.println("输入不合法!!!输入的圆的半径长度必须大于0，请重新出入:");

            r = scan.nextDouble();

        }

        //计算圆的周长,公式为: 2Πr
        double perimeter = 2 * PI * r;

        //计算圆的面积,公式为: Πr^2
        double area = PI * Math.pow(r,2);

        System.out.println("您好，半径为:" + r + "的圆的周长为:" + perimeter +"面积为:" + area);

    }

}
