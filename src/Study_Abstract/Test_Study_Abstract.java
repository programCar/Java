package Study_Abstract;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test_Study_Abstract {
    public static void main(String[] args) {

        Calibrator calibrator = new Calibrator();

        System.out.println("请输入圆的半径:");

        Scanner scan = new Scanner(System.in);

        Shape_Abstract[] area = new Shape_Abstract[3];

        while (true){

           if(calibrator.Circle_Calibrator(scan.nextDouble(), area)){

               System.out.println("圆形面积数据已形成");

               break;
            }else {

                System.out.println("输入有误，圆的半径不能小于等于0，必须大于0，请重新输入!!!");

                System.out.println("请输入圆的半径:");
            }
        }

        System.out.println("请输入矩形的长和宽:");

        while (true){

            if (calibrator.Rectangle_Calibrator(scan.nextDouble(),scan.nextDouble(),area)){

                System.out.println("矩形面积数据已形成");

                break;
            }else {

                System.out.println("输入有误，矩形的长和宽不能小于等于0，必须大于0，请重新输入!!!");

                System.out.println("请输入矩形的长和宽:");
            }
        }

        System.out.println("请输入三角形的三条边:");

        int i = 1;

        int choose;

        while (true){

            choose = calibrator.Triangle_Calibrator(scan.nextDouble(),scan.nextDouble(),scan.nextDouble(),area);

            if (choose == -1){

                System.out.println("输入有误，三角形的三条边长度不能小于等于0，必须大于0，请重新输入!!!");

                System.out.println("请输入三角形的三条边:");
            }else if (choose == -2){

                System.out.println("构成有误，此三条边的长度不能构成一个三角形，请重新输入!!!");

                if (i++ == 3){
                    System.out.println("温馨提示!!!三角形的三边必须满足--任意两边之和必须大于第三边");
                }

                System.out.println("请输入三角形的三条边:");
            }else {

                System.out.println("三角形面积数据已形成");

                break;
            }

        }

        System.out.println("半径的长度为" + calibrator.getRadius() + "的圆的面积为:\t\t" + area[0].Area());

        System.out.println("长的长度为:" + calibrator.getL_ong() + "\t" + "宽的长度为:" + calibrator.getWidth() +
                "的矩形面积为:\t\t" + area[1].Area());

        System.out.println("三边长度分别为:" + calibrator.getFirst_Side() + "\t\t" + calibrator.getSecond_Side() +
                "\t\t" + calibrator.getThird_Side() + "的三角形的面积为:\t" + area[2].Area());

    }

}
