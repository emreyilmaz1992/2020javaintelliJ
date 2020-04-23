package day12_JavaRecap;

import java.util.Scanner;

public class Ternary_Practise {
    public static void main(String[] args) {

        /*
        200 = ok
        201= created
        202= accepted
         */

        Scanner input = new Scanner(System.in);
        String result ="";

        System.out.println("Please enter the status code");

        int statusCode = input.nextInt();

        if(statusCode == 200){
            result =" Okay";
        }else if (statusCode ==201){
            result = "Created";
        }else if(statusCode==202){
            result= "Accepted";
        }else {
            result = "Invalid Status Code";
        }
        System.out.println(result);

        System.out.println("Enter another code");

        String result2 = "";

        result2 =(statusCode == 200)?"OK":(statusCode==201)?"Created":(statusCode==202)?"Accepted":"Invalid Entry";
        System.out.println(result2);












    }
}
