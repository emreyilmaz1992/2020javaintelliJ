package day38_Constructor;

public class ConstructorCalls {

    public ConstructorCalls(){
        method1();
        method2();

    }

    public ConstructorCalls(int a){

        this(); // that's how you call the constructor

    }

    public static void method1(){
      //  method2();

    }

    public  void method2(){
        method1();

    }

}
