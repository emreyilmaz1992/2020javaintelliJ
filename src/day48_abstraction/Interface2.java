package day48_abstraction;

public interface Interface2 {






    public static final int a = 100; // since its final by the default we gotta initialized it rigt away
    // when the letters are not shiny it means they were given by default


    public static void main(String[] args) {

        System.out.println(a);  // by default static

       // a = 200; // by default it is final  so we cannot reassigned it

        System.out.println(Interface2.a); // since its static we can call it through the class name
        Interface2.method4();

    }





    public static void method4(){

    }
    public void method5(); // by default this is abstract method

    public default void method6(){ // this method can only be created in interface
        System.out.println("Default method");
    }



}
