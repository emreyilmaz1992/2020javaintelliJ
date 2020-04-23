package day08_MultiBranchIF;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiBranchIfStatements {
    public static void main(String[] args) {

        int a = 100;

       if(a == 0 ){
           System.out.println("Zero");
       }else if(a <0){
           System.out.println("Negative");
       }else{
           System.out.println("Positive");
       }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score");


        double score = scan.nextDouble();
        char grade = ' ';




        if (score >=90 && score <=100){
           grade = 'A';
       }else if(score >=80 && score <=89){
           grade = 'B';
       }else if(score>=70 && score <=79){
           grade = 'C';
       }else if(score>=60 && score <=69){
           grade = 'D';
       }else{
           grade = 'F';
       }
        System.out.println(score+" score is: "+grade);


       /*
        2. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
            byte month =  3
            28 days: 2
            30 days: 4,6,9,11
            31 days: 1,3,5,7,8,10,12

         */







    }
}
