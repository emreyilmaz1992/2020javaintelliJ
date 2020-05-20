package day42_Inheritance;


class Test {
    public Test(int a) {
        System.out.println("A");
    }


    public Test(double a) {
        this(10);
        System.out.println("C");
    }
}

public class Constructor2  extends Test {

    public Constructor2() {
        super(10.5);  // if the parent class constructor is not default. So we use super keyword. The rule is: At least one parent class MUST be called in sub class
        System.out.println("B");

    }


    public static void main(String[] args) {

       // Test obj1 = new Test(10);
        Constructor2 obj2 = new Constructor2();






    }
}

