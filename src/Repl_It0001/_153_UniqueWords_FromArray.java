package Repl_It0001;

import java.util.Scanner;

public class _153_UniqueWords_FromArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);



    }

    public static void printUniqueWords(String []str){
        for (int i = 0; i <str.length ; i++) {
            int count = 0;

            for (int j = 0; j <str.length ; j++) {

                if (str[i].equals(str[j])){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(str[i]);
            }




        }


    }


}
