package My_Java_Home;

import java.util.Scanner;

/**要求：
 * 用户输入两个字符串，要求判断这两个字符中，其中一个字符是否是另一个字符的子字符
 * 子字符的字符顺序排列要跟主字符的相同，大小写相同
 * 解题思路：
 *将每一个字符串的字符一一取出进行比较，当字符相同时，最小的字符串检索进度加一，只要子字符串跟主字符一个字符不相同，检索进度清零重新开始
 * 当最大的字符串的检索进度未完成，而最小的字符串检索进度完毕，则说明这两个字符串是包含关系
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

        //用于接收最大的字符串的字符用于字符串之间的对比
        char first_Char;

        //用于接收最小的字符串的字符用于字符串之间的对比
        char second_Char;

        //用于标记最小字符串的对比相同的进度，进行最后的裁决（是否相同）
        int index = 0;

        //储存最大字符串的长度
        int max_length = ransomNote.length();

        //储存最小字符串的长度
        int min_length = magazine.length();

        //如果发生字符串的大小关系变化时，进行储存值交换
        int teep = 0;

        //如果第一个字符串大于第二个字符串则采用这个进行判断
        if(ransomNote.length() > magazine.length()){

            //从长度最大的字符串进行检索
            for (int i = 0; i < max_length; i++){

                //不断取出最大字符串中的每一个字符
                first_Char = ransomNote.charAt(i);

                if(index<magazine.length()){

                    //不断取出最小字符串中的每一个字符
                    second_Char = magazine.charAt(index);

                    //将取出字符进行一一比较
                    if(second_Char == first_Char){

                        //如果相同则最小字符串的检索进度加一
                        index++;

                    }else{

                        //如果不相同则最小字符串的检索进度则清空重新开始
                        index = 0;

                    }

                }else{

                    //如果最小的字符串检索进度完成，则说明有相同的字符，这两个字符串是包含关系
                    break;
                }

            }

            if(index<magazine.length()){

                return "false";

            }else{

                return "true";

            }

            //如果第一个字符串小于第二个字符串则采用这个进行判断
        }else{

            //重新赋值
            teep = max_length;

            max_length = min_length;

            min_length = teep;

            //原理同上
            for (int i = 0; i < max_length; i++){

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

            if(index<ransomNote.length()){

                return "false";
            }else{

                return "true";
            }

        }

    }

}
