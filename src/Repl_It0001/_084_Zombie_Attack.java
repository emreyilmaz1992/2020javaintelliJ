package Repl_It0001;

import java.util.Scanner;

public class _084_Zombie_Attack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int i = 0;
        while(true){


            if(inhabitants <= 0) {
                System.out.println("---- EXTINCT ----");
                break;
            }

            System.out.println("Day"+i+" ["+inhabitants+"]");
            inhabitants= inhabitants/2;

            if(inhabitants <1){
                System.out.println("---- EXTINCT ----");
                break;
            }
            i++;
        }
    }
}
