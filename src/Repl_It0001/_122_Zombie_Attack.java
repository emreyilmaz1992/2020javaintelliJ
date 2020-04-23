package Repl_It0001;

import java.util.Arrays;
import java.util.Scanner;

public class _122_Zombie_Attack {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];


        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();

        }



        int i = 0;
        while(i<inhabitants.length){
            System.out.println("Day "+i+" "+Arrays.toString(inhabitants));

            int max = Integer.MIN_VALUE;
            for (int eachZombie : inhabitants ){
                if(eachZombie > max) {
                    max = eachZombie;
                }
                if(eachZombie > 0){
                    eachZombie = eachZombie/2;
                }else{
                    eachZombie = eachZombie;
                }
            }




            i++;
        }




















    }
}
