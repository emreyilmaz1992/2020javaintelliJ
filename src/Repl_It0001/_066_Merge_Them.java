package Repl_It0001;

import java.util.Scanner;

public class _066_Merge_Them {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        String x = ""+  word1.charAt(0)+word2.charAt(0)+word1.charAt(1)+word2.charAt(1)+word1.charAt(2)+word2.charAt(2);

        if(word1.length() == 3 && word2.length() == 3){
            System.out.println(x);
        }else {
            System.out.println("cannot merge");
        }




    }
}
