package Repl_It0001;

public class Assessment_5_2 {
    public static void main(String[] args) {


        int num1 = 4;
        int num2 = 20;
        String result="";


        for (int i = num1; i <=num2 ; i++) {


            if(i % 2 == 1 || i % 2 == -1){

                result+=i+" ";

            }
        }
        System.out.println(result);







    }
}
