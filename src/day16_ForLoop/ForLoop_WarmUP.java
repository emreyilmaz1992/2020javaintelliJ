package day16_ForLoop;

public class ForLoop_WarmUP {
    public static void main(String[] args) {
        /* 1. write a program that can print all the ODD numbers between 1 ~ 100 that can be divisible by 3 & 5
        2. write a program that can print all the EVEN numbers between 1 ~ 100 that can be divisible by 3 & 5
        3. write a program that can calculate the sum of all the even numbers between 1 ~ 100
        4. write a program that can calculate the sum of all the odd numbers between 1 ~ 100;
        5. Write a program that will print out all letters in English alphabet in ascending order
        6. Write a program that will print out all letters in English alphabet in descending order
        7. write a program that can calculate the sum of all numbers between 1 to any given number
        ex:
        input: 100
        output: 5050
        input: 50
        output: 1275
        input : 200
        output : 20100

        */

        for (int i = 1; i < 100; i++) {  //1st and 2nd question
            if( i%2 !=0){
                if(i % 15 ==0)
                System.out.print(i+ " ");
            }
        }









    }
}
