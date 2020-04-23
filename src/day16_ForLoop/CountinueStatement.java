package day16_ForLoop;

import javax.swing.plaf.IconUIResource;

public class CountinueStatement {
    public static void main(String[] args) {


        for (int i = 1; i <=5 ; i++) {  //i: 1,2,3,4,5

            if(i ==3){

                continue; //gonna skip iteration 3

            }
            System.out.println(i); //1,2,4,5

        }


        for (int i = 0; i <=20; i++) {

            if(i%2 !=0) //skips all odd numbers
                continue;    //(i%2 ==0) with continue skips the even numbers

            System.out.print(i+" ");

        }









    }





}
