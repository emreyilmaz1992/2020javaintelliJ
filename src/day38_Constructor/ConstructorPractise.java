package day38_Constructor;

public class ConstructorPractise {

    public ConstructorPractise(){
        this(10.0);
        System.out.println("A");

    }

    public ConstructorPractise(int a){
        this();
        System.out.println("B");
    }

    public ConstructorPractise(double a){
        System.out.println("C");
    }

    public static void main(String[] args) {


        new ConstructorPractise(10);







    }





}
