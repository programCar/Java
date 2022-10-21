package My_Java_Home.Study_EffectScope;

/**
 * Java课程，课后习题，变量的作用范围(变量的作用范围)
 * 变量只能在它所定义的语句块内被使用，一个语句块就是用一对花括号括起来的代码段,块定义了一个作用域
 * 注意：超过这个范围，变量将失效
 */
public class VariateEffectScope {


    public static void main(String[] args) {

        int a = 2;

        System.out.println("a = " + a);

        {
            int b = 4;

            System.out.println("b = " + b);
        }

        //System.out.println("b = " + b); 会报错

        System.out.println("a = " + a);

    }

}
