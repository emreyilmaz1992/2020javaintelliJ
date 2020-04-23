package Repl_It0001;

import java.util.Scanner;

public class _Binary {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int[] binary = new int[8];
        for(int i =0; i < binary.length; i++) {
            binary[i] = input.nextInt();
        }


        int []binaryX = new int[binary.length];

        int result = 0;

        int j = 0;
        for (int i = binary.length; i >0 ; i--) {


            binaryX[j] = binary[i];


            j++;
        }


        for (int i = 0; i <binary.length ; i++) {

            if(binaryX[i] == 1){

                result+= Math.pow(2,i);
            }




        }
        System.out.println(result);











    }
}
