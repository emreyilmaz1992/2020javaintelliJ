package Repl_It0001;

import java.util.Arrays;
import java.util.Scanner;


public class _000001_Ecercise {

    public static int isEven (int num1 ){

        boolean valid = true;

        if(num1 % 2 ==0){
            System.out.println(valid);
        }else{
            System.out.println(!valid);
        }
        return num1;
    }



    public static void main(String[] args) {

     isEven(5);


    }

}
