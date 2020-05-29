package day44_Exceptions;

public class _10_WarmUp2 {

    public static void waits(double seconds) {
        try {
            Thread.sleep((long)seconds*1000);
        } catch (Exception e) {
        }

    }

    public static void main(String[] args) {

        System.out.println("Java");
        waits(3.5);
        System.out.println("Cybertek");
    }



}
