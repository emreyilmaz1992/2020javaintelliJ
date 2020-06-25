package day50_Polymorphism;

public class ReferenceTypeCasting {
    public static void main(String[] args) {

        int a = 100;
        double b = a; // implicitly done

        Dog dog = new Dog("A",3,"f");

        Animal animal1 = (Animal)dog; // up casting, done implicitly

        Cat cat = new Cat("r","female",2);

        Animal animal2 =cat; //upcasting, done implicitly

        System.out.println("===========================================");

        double c = 100;
        int d = (int)c; // explicit casting

        Animal animal3 = new Dog("K",2,"Male");

        Dog dog3 = (Dog)animal3; //done explicitly downcasting

        Animal animal4 = new Cat("C","Male",3);

        Cat cat2 = (Cat)animal4;

        System.out.println("================================");

        Animal animal5 = new Dog("Lucy",4,"Female");

       // animal5.bark(); we can't

        Dog dog2 = (Dog)animal5;
        dog2.bark();

        // Second way:
        ((Dog) animal5).bark();




    }
}
