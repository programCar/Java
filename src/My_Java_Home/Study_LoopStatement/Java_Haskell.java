package My_Java_Home.Study_LoopStatement;

/**
 * Java课程，课后练习（九九乘法表）
 */
public class Java_Haskell {


    public static void main(String[] args) {

        //存储第一个乘数
        int multiplier_First;

        //储存第二个乘数
        int multiplier_Second;

        //储存积数
        int accumulate;

        System.out.println("九九乘法表 : ");

        System.out.println();

        System.out.println();

        for (int i=1; i<10; i++){

            //实现第一个乘数从1到9的变化
           multiplier_First = i;

           for (int j=1; j<=i; j++){

               //实现第二个乘数从1到九的变化
               multiplier_Second = j;

               //实现乘数乘以乘数等于积的逻辑
               accumulate = multiplier_First * multiplier_Second;

               System.out.print(multiplier_First + " * " + multiplier_Second + " = " + accumulate + "       ");

           }

           System.out.println();

           System.out.println();

       }

    }

}
