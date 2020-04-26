package Repl_It0001;

import java.util.Arrays;
import java.util.Scanner;

public class _00001Empty {

    public static void main(String[] args) {
/*
        Scanner input = new Scanner(System.in);
        boolean isAvailable = input.nextBoolean();
        int month = input.nextInt();
        int day = input.nextInt();
        int year = input.nextInt();

 */


        System.out.println(simpleRoomBook(true,2,1,2019));






    } public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
        boolean b1 = true;

        if(year == 2018){
            if(month == 7 && day <= 8 && day >=1){
                return !b1;
            }else if ( !isAvailable){
                return isAvailable;
              }else if (year != 2018){
                return !b1;
            }else {

            }
            }else if (year !=2018){
            return !b1;
        }

        return isAvailable;



    }



}
