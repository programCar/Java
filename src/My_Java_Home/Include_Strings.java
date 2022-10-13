package My_Java_Home;


import java.util.Scanner;

/**要求：
 * 用户输入两个字符串，要求判断这两个字符串是否是包含关系
 *
 * 解题思路：
 *将每一个字符串的字符一一取出进行比较，当最大的字符串的检索进度未完成，而最小的字符串检索进度完毕，则说明这两个字符串是包含关系
 *
 */
public class Include_Strings {


    public static void main(String[] args) {


        System.out.println("请输入您想要输入的第一个字符串 :");


        Scanner scan = new Scanner(System.in);


        String ransomNote = scan.next();


        System.out.println("请输入您想要输入的第二个字符串 :");


        String magazine = scan.next();


        switch (canConstruct(ransomNote,magazine)){

            case "false" : System.out.println("您输入的字符串不一样!");
            break;

            case "true" : System.out.println("您输入的字符串一样!");
            break;
        }

    }

    public static String canConstruct(String ransomNote, String magazine) {


        char first_Char;                                    //用于接收最大的字符串的字符用于字符串之间的对比


        char second_Char;                                   //用于接收最小的字符串的字符用于字符串之间的对比


        int index = 0;                                      //用于标记最小字符串的对比相同的进度，进行最后的裁决（是否相同）


        int max_length = ransomNote.length();               //储存最大字符串的长度


        int min_length = magazine.length();                 //储存最小字符串的长度


        int teep = 0;                                       //如果发生字符串的大小关系变化时，进行储存值交换


        if(ransomNote.length() > magazine.length()){        //如果第一个字符串大于第二个字符串则采用这个进行判断

            for (int i = 0; i < max_length; i++){           //从长度最大的字符串进行检索

                first_Char = ransomNote.charAt(i);          //不断取出最大字符串中的每一个字符

                if(index<magazine.length()){

                    second_Char = magazine.charAt(index);   //不断取出最小字符串中的每一个字符

                    if(second_Char == first_Char){//将取出字符进行一一比较

                        index++;                            //如果相同则最小字符串的检索进度加一

                    }else{

                        index = 0;                          //如果不相同则最小字符串的检索进度则清空重新开始

                    }

                }else{

                    break;                                  //如果最小的字符串检索进度完成，则说明有相同的字符，这两个字符串是包含关系
                }

            }


        }else{                                              //如果第一个字符串小于第二个字符串则采用这个进行判断


            teep = max_length;                              //重新赋值

            max_length = min_length;

            min_length = teep;

            for (int i = 0; i < max_length; i++){           //原理同上

                first_Char = magazine.charAt(i);

                if(index<ransomNote.length()){

                    second_Char = ransomNote.charAt(index);

                    if(second_Char == first_Char){

                        index++;

                    }else{

                        index = 0;

                    }

                }else{

                    break;
                }

            }


        }



        if(index<ransomNote.length()){

            return "false";
        }else{

            return "true";
        }

    }
}
