package Repl_It0001;

public class _143_Rectangle {
    public static void main(String[] args) {











    }
    public static void printHollowRect (int num1){





        for (int i = 0; i <= num1; i++) {

            for (int j = 0; j <= num1; j++) {

                if (i == 0 || i == num1) {
                    System.out.print("*");
                } else {
                    if (j == 0 || j == num1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }


            }

            System.out.println();
        }


    }







}
