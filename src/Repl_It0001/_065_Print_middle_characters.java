package Repl_It0001;

import java.util.Scanner;

public class _065_Print_middle_characters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

       int middle = word.length()/2;



        if(word.length() == 5 && word.length()%2 == 1){
            word = word.substring(middle-1,middle)+word.substring(middle,middle+1)+word.substring(middle+1,middle+2);
            System.out.println(word);
        }else {
            System.out.println("Invalid");
        }




    }
}
