package day35_Static;

public class staticMethod {

    int a = 100; // instance
    static int b =200;
    public static void main(String[] args) {

       // System.out.println(a); // static only accepts static

        staticMethod obj = new staticMethod();
        System.out.println(obj.a);

        System.out.println("======================");

        System.out.println(b);
        System.out.println(obj.b); // statics prefers to be called through the class name


    }

    public void method(){ // instance method , so you can call instances
        System.out.println(a);
        System.out.println(b); // you can use static anywhere in the class, only thing about static is there is just 1 copy
    }

}
