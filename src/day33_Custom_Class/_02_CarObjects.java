package day33_Custom_Class;

public class _02_CarObjects {



    public static void main(String[] args) {


        Car car1 = new Car();

        car1.brand = "BMW";
        car1.model = "X5";
        car1.year = 2020;
        car1.color = "Blue";

        System.out.println(car1.brand);   // instance variable are object variable, you can call them through the object name
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);

        car1.start(); // BMW is started
        car1.drive(); // Driving BMW
        car1.getCarInfo();

        System.out.println("======================================");

        Car car2 = new Car();


        car2.brand = "Mercedes";
        car2.model = "S500";
        car2.year = 2020;
        car2.color = "Black";

        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);

        car2.start(); //  Mercedes is started
        car2.drive(); //  Driving Mercedes
        car2.getCarInfo();

        System.out.println("============================");

        Car[] cars = {car1,car2};

        cars[0].getCarInfo();












    }
}
