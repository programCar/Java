package My_Java_Home.Study_PackageAndImport;

import java.util.Scanner;

/**
 * Java课程，课后习题，学习import和package语句
 * 包是一个相对独立的软件单元
 * import语句用于导入某包中的类
 * 包类似于文件夹，文件夹里有很多类，包也可以有子包（就是文件夹里还有文件夹）
 * 一个包内中的类的完全限定名是:包名.类名
 * 如果包里有子包，则子包中类的完全限定名为:包名.子包名.类名（Scanner类就是在java包的util子包中的类）
 * import 包名.*代表导入包中的所以类
 */
public class Thousand_LocationNumberAdd {


    public static void main(String[] args) {

        System.out.println("请输入一个四位数的正整数:");

        Scanner scan = new Scanner(System.in);

        int thousand_Number = scan.nextInt();

        //判断输入的数字是不是一个千位正整数数字，提高程序健壮性
        while (thousand_Number / 1000 <= 0){

            System.out.println("输入不合法!!!请输入一个四位数的正整数");

            thousand_Number = scan.nextInt();

        }

        //得到千位上的数字
        int location_Thousand = thousand_Number / 1000;

        //得到百位上的数字
        int location_Hundred = thousand_Number / 100 % 10;

        //得到十位上的数字
        int location_Tens = thousand_Number / 10 % 10;

        //得到个位上的数字
        int location_One = thousand_Number % 10;

        //计算各位置数字相加的和
        int thousand_LocationNumberAdd = location_Thousand +
                location_Hundred + location_Tens + location_One;

        //输出最终结果
        System.out.println("您好，您输入的 :" + thousand_Number
                +"数字，各个位置数字相加的和为 :" + thousand_LocationNumberAdd);;



    }
}
