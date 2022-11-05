package My_Java_Home;

import java.util.Scanner;

/**
 * @author:ZengYuanQuan(programCar)
 */
public class Hello_Java {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String english = scan.next();

        int word_number1 = 0;

        int word_number2 = 0;

        char word1 = 0;

        char word2 = 0;

        for(int i = 0; i < english.length()-1; i++){

            word1 = english.charAt(i);

            for(int j = i+1;j < english.length(); j++){

                if (word1 == english.charAt(j)){

                    ++word_number1;
                }

            }

            if (word_number2 < word_number1){

                word2 = word1;

                word_number2 = word_number1;

            }else if (word_number2 == word_number1){

                if (word1 < word2){

                    word2 = word1;
                }
            }


            word_number1 = 0;

        }

        System.out.println(word2 + "," + (word_number2+1));



    }

}
