package day25_MethodsRecaps;

public class _01_Return_Statement {
    public static void main(String[] args) {
/*
        if(10>9){
            return;
        }
        System.out.println("Hello"); // cuz of return it exits the method. even it's main method.hello will nor be printed

 */

        method1();
        System.out.println("Hello");





    }
    public static void method1(){
        if(10>9){
            return;  // return exits the medhod1 only. not main method
        }
        System.out.println("Hello Cybertek");
    }
    public static void method2(){
        if(10>9){
            System.exit(0);
        }
        System.out.println("Hello Cybertek");
    }
}
