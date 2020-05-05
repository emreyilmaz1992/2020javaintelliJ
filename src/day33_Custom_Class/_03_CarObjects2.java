package day33_Custom_Class;


// We don't need import since car and carObjects in the same package

public class _03_CarObjects2 {






    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setCarInfo("BMW","X5",2020,"BLACK");

        car1.getCarInfo();

        Car car2 = new Car();
        car2.setCarInfo("Mercedes","S500",2020,"Red");

        car2.getCarInfo();

        Car car3 = new Car();
        car3.setCarInfo("Audi","Q8",2020,"Gray");

        car3.getCarInfo();

        System.out.println("=======================================");

        Car[] cars = {car1, car2, car3};

        for (int i = 0; i <cars.length ; i++) {
            cars[i].getCarInfo();

        }

        System.out.println("========================================");

        for(Car eachCar: cars){

            eachCar.getCarInfo();

        }
        System.out.println(car1); // toString methiod from the car gets executed.Otherwise we get hashCode


    }
}
