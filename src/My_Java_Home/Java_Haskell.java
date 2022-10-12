package My_Java_Home;


/**
 * @author:ZengYuanQuan(programCar)
 */


public class Java_Haskell {

    public static void main(String[] args) {


        int multiplier_First;                                       //存储第一个乘数


        int multiplier_Second;                                      //储存第二个乘数


        int accumulate;                                             //储存积数


        System.out.println("九九乘法表 : ");


        System.out.println();


        System.out.println();


        for (int i=1; i<10; i++){

           multiplier_First = i;                                    //实现第一个乘数从1到9的变化

           for (int j=1; j<=i; j++){

               multiplier_Second = j;                               //实现第二个乘数从1到九的变化

               accumulate = multiplier_First * multiplier_Second;   //实现乘数乘以乘数等于积的逻辑

               System.out.print(multiplier_First + " * " + multiplier_Second + " = " + accumulate + "       ");

           }


           System.out.println();


           System.out.println();

       }
    }

}
