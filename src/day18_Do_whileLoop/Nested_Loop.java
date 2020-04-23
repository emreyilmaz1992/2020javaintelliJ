package day18_Do_whileLoop;

public class Nested_Loop {
    public static void main(String[] args) {

        for (int i = 1; i <=5 ; i++) {



            for (int j = 1; j <=5 ; j++) {
                System.out.print(j+" ");

            }
            System.out.println();

        }

        System.out.println("==============================");

        /*

         * * * * * * *
         * * * * * * *
         * * * * * * *
         * * * * * * *
         * * * * * * *
         * * * * * * *
         * * * * * * *


         */

        for (int i = 0; i <7 ; i++) {// outer loop repeating inner loop over and over again


            int a = 1;
            while (a <= 10) {

                System.out.print("* ");
                a++;

            }
            System.out.println();
        }













    }
}
