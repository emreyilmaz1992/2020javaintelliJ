package day54_Maps;

public class Garbage_collector {

    public static void main(String[] args) {



        System.out.println("Done");

        // unreference an object:

        String str = new String("Cybertek");
        str = new String("MIT");

        System.out.println(str);


        Integer num = new Integer(123);
        num =  new Integer(124);

        //123 will be collected by garbage collector

        Double n = new Double(0.5);
        n = null;

        System.out.println(n);



    }
}