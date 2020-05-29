package day44_Exceptions;

public class _05_ExceptionHandling {
    public static void main(String[] args) {


        String str = "Cybertek";
        String result = "";

        try{
            System.out.println(str.charAt(100));
        }catch ( RuntimeException e){

          String description =  e.getMessage();
            System.out.println(description);
        }


        System.out.println("=========================");



        try{
            System.out.println(100 / 0);  // whenever it finds the exception it jumps to the catch block. Doesn't check any line below exception
            System.out.println("Try block");
        }catch (ArithmeticException e){
             result  = e.getMessage();

        }
        System.out.println(result);


        System.out.println("Completed");



    }
}
