package Repl_It0001;

import java.util.Scanner;

public class _154_Palindrome_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);






    }

    public static void isPalindrome(int num){

        String str = ""+num;
        String result = "";
        boolean b1 = true;

        for (int i = str.length()-1; i >=0 ; i--) {

            result+= str.charAt(i);

        }
        //System.out.println(result);

        if(result.equals(str)){
            System.out.println(b1);
        }else{
            System.out.println(!b1);
        }


    }




}
