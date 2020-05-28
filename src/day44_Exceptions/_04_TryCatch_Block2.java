package day44_Exceptions;

public class _04_TryCatch_Block2 {
    public static void main(String[] args) {

        System.out.println("Hello");

        try {
            Thread.sleep(2000);
            System.out.println("Try block");    // similar to if else. Only one of them gets executed

        }catch (Exception e) { // we also can give interruptedException
            System.out.println("Catch block");

        }
        System.out.println("World");

    }
}
