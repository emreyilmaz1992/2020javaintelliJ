package day44_Exceptions;
/*
1. Write a method called "wait" that causes the current executing thread to sleep for the specific number of seconds
parameters: double seconds
 */
public class _09_WarmUp {

    public static void main(String[] args) {
        /* print hello
        wait 2 seconds
        print cybertek
        wait 3 seconds
        Java
         */

               System.out.println("Hello");

        try{
            Thread.sleep(2000);
        }catch (Exception e){

        }

        System.out.println("Cybertek");
        try{
            Thread.sleep(3000);
        }catch (Exception e){

        }
        System.out.println("Java");

        try{
            Thread.sleep(4000);
        }catch (Exception e){

        }





    }


}
