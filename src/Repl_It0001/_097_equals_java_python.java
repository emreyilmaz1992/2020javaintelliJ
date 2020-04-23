package Repl_It0001;

import java.util.Scanner;

public class _097_equals_java_python {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        sentence = sentence.toLowerCase();
        int count1= 0;
        int count2= 0;


        for (int i = 0; i <sentence.length() ; i++) {
            if (sentence.contains("java")){

                sentence = sentence.replaceFirst("java", "");
                count1++;
            }
        }

        for (int j = 0; j <sentence.length(); j++) {


                if (sentence.contains("python")) {
                    sentence = sentence.replaceFirst("python", "");
                    count2++;
                }

            }
            if (count1 == count2) {
                System.out.println("true");

            }else{
                System.out.println("false");

            }






















    }
}
