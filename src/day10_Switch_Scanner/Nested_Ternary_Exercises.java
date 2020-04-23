package day10_Switch_Scanner;

import java.util.Scanner;

public class Nested_Ternary_Exercises {
    public static void main(String[] args) {

       /* Warm up task:
        1. Wash your hand
        2. write a program that can display the days based on the numbers 1 ~ 7
        MUST USE NESTED IF
        3. write a java program that can convert numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".
                DO NOT USE IF STATEMENTS
        4. write a program that can find the number of days in a month
                (Assume that Feb has 28 days)
        28 days: 2
        30 days: 4,6, 9, 11
        31 days: 1,3,5,7,8,10,12
        MUST USE NESTED IF

        */


        int numDays=1;
        String result= " ";





        if(numDays>0 && numDays<8){
            if(numDays ==1){
                result = "Monday";
            }else if(numDays == 2){
                result = "Tuesday";
            }else if(numDays == 3){
                result = "Wedneesday";
            }else if (numDays== 4) {
                result = "Thursday";
            }else if (numDays == 5){
                result = "Friday";
            }else if(numDays==6){
                result="Saturday";
            }else {
                result="Sunday";
            }
        }else {
            System.out.println("Invalid Entry!");
        } System.out.println(numDays + " equals to " + result);




        int num =2;
        String result2= " ";


        result2= (num == 1)?"Monday":(num==2)?"Tuesday":(num==3)?"Wednesday":(num==4)?"Thurdays":
                    (num==5)?"Friday":(num==6)?"Saturday":(num==7)?"Sunday":"Invalid Entry";

        System.out.println(num+ " equals to "+result2);


        String result3= "";

        if(num >0 && num <8){
            result3= (num == 1)?"Monday":(num==2)?"Tuesday":(num==3)?"Wednesday":(num==4)?"Thurdays":
                    (num==5)?"Friday":(num==6)?"Saturday":"Sunday";






        }else{
            result3 = "Invalid";
        }
        
        if(numDays>0 && numDays<8){
            System.out.println(result);
            System.out.println(result2);
            System.out.println(result3);
        }else{
            System.out.println("Invalid");
        }


        // 0-9

        int num2 = 9;

        String word = (num2 ==0)?"zero":(num2==1)?"one":(num2==2)?"two":(num2==3)?"three":(num2==4)?"four":
                (num2==5)?"five":"invalid";

        System.out.println(word);

        



















    }
}
