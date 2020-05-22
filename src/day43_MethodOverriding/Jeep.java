package day43_MethodOverriding;

public class Jeep extends Car {

    @Override
    protected void start(){
        System.out.println("Call Mechanic\nDo your Oil change\nThen Jump Start");
      //  System.out.println("Twist ignition key to start");
    }
}
