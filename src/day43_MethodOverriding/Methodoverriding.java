package day43_MethodOverriding;

class Test{

     protected void method(){

        System.out.println("Kehribar");
    }




}

public class Methodoverriding extends Test{
    @Override
    protected void method(){

    }

    public static void main(String[] args) {


        Test obj1 = new Test();

        obj1.method();

        Methodoverriding obj2 = new Methodoverriding();
        obj2.method();


    }
}
