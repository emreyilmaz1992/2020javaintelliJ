package day38_Constructor;

public class Test {

    public Test(){
        System.out.println("Consrtructor");
    }

    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Instance block");
    }



    public static void main(String[] args) {
        System.out.println("Main Method");
        new Test(); // instance, constructor

        new Test();
        System.out.println("Main Method");



    }
}
