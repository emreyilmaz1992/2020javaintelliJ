package Replit_Custom_Methods;

public class Car {

    String make;
    String model;
    int numOfDoors;
    int topSpeed;
    double price;

    public Car(String make, String model, int numOfDoors, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.numOfDoors = numOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public Car(String make, String model, int topSpeed, double price) {
        this(make,model,4,topSpeed,price);


    }
    public Car(int numOfDoors, int topSpeed, double price){
        this("unknown","unknown",numOfDoors,topSpeed,price);

    }
    public Car(String make, String model, int numOfDoors){
        this(make,model,numOfDoors,90,0);
    }


    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numOfDoors=" + numOfDoors +
                ", topSpeed=" + topSpeed +
                ", price=" + price +
                '}';
    }
}
class check3{
    public static void main(String[] args) {


        Car car1 = new Car(4,300,80000);
        System.out.println(car1);
        System.out.println(car1.numOfDoors);

    }
}