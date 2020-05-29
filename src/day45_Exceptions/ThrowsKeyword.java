package day45_Exceptions;

public class ThrowsKeyword {

    public static void sleep(double second) throws InterruptedException{


        Thread.sleep((long)second*1000);
    }


    public static void main(String[] args) throws InterruptedException {


        System.out.println("Cybertek");
        sleep(3);
        System.out.println("Java");





    }
}
