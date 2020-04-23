package Repl_It0001;

import java.util.Scanner;

public class _115_FindingLongestWordinArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];

        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }



        // String [] words= {"aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"};
        String result = "";
        int max = 0;
        for (int i = 4; i >=0 ; i--) {

            if(words[i].length() >max ){
                max = words[i].length();

                result = words[i];


            }

        }
        System.out.println(result);

    }
}
