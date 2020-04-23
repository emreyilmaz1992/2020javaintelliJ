package Repl_It0001;

import java.util.Scanner;

public class _064_Middle_one {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();


       int middle = word.length()/2;





        if(word.length() >= 3 && word.length()%2 ==1){

            word = word.substring(middle,middle+1);
            System.out.println(word);
        }else if(word.length() ==1){
            word = word+word+word;
            System.out.println(word);
        }else if(word.length()>= 4 && word.length()%2 ==0){
            word = word.substring(middle-1,middle)+ word.substring(middle,middle+1);
            System.out.println(word);
        }else if(word.length() == 2){
            word = word+word;
            System.out.println(word);
        }




    }
}
