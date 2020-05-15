package day38_Constructor;

public class ConstructorCalls2 {

    public ConstructorCalls2(){

        System.out.println("Default Constructor");

    }

    public ConstructorCalls2(int a){

        this(); // Default Constructor
        System.out.println("Constructor with int argument ");

    }

    public ConstructorCalls2(String str){

        this(10);
        System.out.println("Constructor with String argument");





    }

    public static void main(String[] args) {

        ConstructorCalls2 obj1 = new ConstructorCalls2();

        System.out.println("===========================");

        ConstructorCalls2 obj2 = new ConstructorCalls2(10);
        System.out.println("===========================");

        ConstructorCalls2 obj3 = new ConstructorCalls2("str");










    }

    public void method1(){

       // ConstructorCalls2; we cannot call it outside the consructor

    }




}
