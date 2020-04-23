package day19_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Practise2 {
    public static void main(String[] args) {
        /*

        int[] arr = {10, 20, 30};

        System.out.println(arr.length); //3


        int [] arr2 = new int[5];

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);


        String[] Testers = new String[3]; // {"Ahmet", "Mehmet", "Osman"}
                // index: 0 ,1 ,2

        Testers[0] = "Ahmet";
        Testers[2] = "Osmna";

        System.out.println(Testers[0]); //Ahmet
        System.out.println(Testers[1]); //null
        System.out.println(Testers[2]); //Osman

        System.out.println(Testers.length); //3

        System.out.println();
        System.out.println("================================");
        System.out.println();

         */
        
        
        
        
        String[] students = new String[3];
        // write a program that asks enter a name 10 times and stores each name in the array student

        Scanner input = new Scanner(System.in);

        int i = 0;
        String result = "";
        while(i <3){

            System.out.println("Drop the name");
            String names = input.next();
            students[i] = names;




            i++;

        }System.out.print(Arrays.toString(students));







    }
}
