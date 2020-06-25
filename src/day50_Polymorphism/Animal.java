package day50_Polymorphism;

public abstract class Animal { //2vars 2 ins methods

    public int age;
    public String gender;

    public void eat(){
        System.out.println("Animal is eating");
    }
    public  void sleep(){
        System.out.println("Animal is sleeping");
    }
    public static void methodA(){

        System.out.println("Animal");
    }

}
