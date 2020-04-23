package day18_Do_whileLoop;

public class Nested_Loop2 {
    public static void main(String[] args) {

        /*

        *
        * *
        * * *
        * * * *
        * * * * *

         */
        String result ="";


        for (int j = 1; j <=9 ; j++) {


            for (int i = 1; i <= j; i++) {

                System.out.print("*  ");
            }
            System.out.println();
        }

        System.out.println("=====================");

        for (int h = 9; h >=1 ; h--) {

            for (int l = h; l >=1; l--) {
                System.out.print("*  ");

            }
            System.out.println();
        }

        System.out.println("=====================");
        /*
        a
        a b
        a b c
        a b c d
        a b c d e
         */
        for (char j = 'h'; j >='a' ; j--) {


            for (char i = j; i >= 'a'; i--) {
                System.out.print(i + " ");


            }
            System.out.println();
        }






    }
}
