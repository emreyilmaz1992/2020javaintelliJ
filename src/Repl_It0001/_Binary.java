package Repl_It0001;

import java.util.Scanner;

public class _Binary {
    public static void main(String[] args) {

        int result = 0;
        int a =  128;
        Scanner input = new Scanner(System.in);

        int[] binary = new int[8];
        for(int i =0; i < binary.length; i++) {
            binary[i] = input.nextInt();
        }



        int j = binary.length-1;
        for (int i = 0; i <binary.length ; i++) {

            if(binary[i] == 1){
                result+= Math.pow(2,j);
            }
            j--;
        }
        System.out.println(result);















    }
}
