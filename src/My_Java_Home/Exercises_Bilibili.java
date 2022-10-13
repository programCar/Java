package My_Java_Home;


import java.util.ArrayList;


import java.util.Random;


import java.util.Scanner;

/**
 *要求
 *用户输入一串数字，并且在输入后想要删除几个数字，数字不知道是具体数值和位置，只知道删除了多少个数字，在用户操作后要求给出数组中有多少个不同的数字。
 *不能破坏用户输入的数据
 * 接受用户输入的数据必须是数组
 *
 *解题思路：
 *    为了不损坏原数组arr里面的数据且方便后面对数据的处理，可以先创建一个ArrayList<Integer>类型的arr_List集合对象
 *用于储存arr数组的数据。定义一个int类型变量common_number用于后续发现arr_List集合中相同的值，然后去删除相同的值，
 *保留不相同的值在里面，实现（找出删除后数组中不同整数的最少数目）。
 *又因为删除K个元素，它删除的位置是随机的，所以必须创建一个随机数对象random,用于生成随机数，且因为
 *它删除的范围始终在arr_List集合长度范围内（arr数组长度范围内），且数组的位置为0，1，2这样的整型数据，所以需要把调用
 *random对象中的nextInt方法，并且把arr_List集合长度作为实参传给nextInt方法.
 *由于arr_List集合内相同的值都被删除，所以留下来的都是不相同的值，只需要计算出arr_List集合内元素的个数作为数据返回即可
 *
 */


public class Exercises_Bilibili {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        System.out.println("请问您想要输入多少个数字 :");


        int enter_Number = scan.nextInt();                      //用于接收用户输入并且作为创建数组空间的大小的依据


        int[] arr = new int[enter_Number];                      //用于储存用户想要输入的数据


        System.out.println("请输入您想要输入的数字 :");


        for (int i = 0; i < enter_Number; i++){

            arr[i] = scan.nextInt();

        }


        System.out.println("请输入您想要删除数字的数目 :");


        int delete_Number = scan.nextInt();                     //用于接受用户想要删除的数量


        System.out.println("您输入的数据，在被您移除" + enter_Number + "个元素后，还剩下" +
                findDeletedNumOfDifferenceNumber(arr,delete_Number) + "个不同的数字");


    }



    public static int findDeletedNumOfDifferenceNumber(int[] arr, int k) {


            ArrayList<Integer> arr_List = new ArrayList<>();    //用于储存arr数组的数据，方便以后对这些数据的处理和对原数据的保护


            int common_Number = 0;                              //用于发现移除K个元素后，arr_List集合内相同的值


            Random random = new Random();                       //用于生成随机数，实现题目移除数据位置随机的逻辑


            int random_Number = 0;                              //用于储存生成的随机数


            for(int i = 0; i < arr.length; i++){                //将arr数组数据搬到arr_List集合中，起到对arr数组数据的保护和方便对数据的处理

                arr_List.add(arr[i]);

            }


            for(int i = 0; i < k; i++){                         //用于随机移除K位元素

                random_Number = random.nextInt(arr_List.size());

                arr_List.remove(random_Number);

            }


            if(arr_List.size() == 1){                           //如果arr_List集合内元素在移除后只剩下一个则不参与以下计算直接返回1

                return 1;

            }


            for(int i = 0; i < arr_List.size()-1; i++){         //用于删除arr_List集合内相同的值

                common_Number = arr_List.get(i).intValue();

                for(int j = i+1; j < arr_List.size(); j++){     //用于发现arr_List集合内相同的值

                    if (common_Number == arr_List.get(j).intValue()){

                        arr_List.remove(j);                     //删除arr_List集合内相同的值
                    }

                }

            }


            return arr_List.size();                             //返回arr_List集合的长度，实现找出删除后数组中不同整数的最少数目

        }

}
