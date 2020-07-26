package day50_Polymorphism;

public class AnimalObject {
    public static void main(String[] args) {


        Dog obj1 = new Dog("Max",5,"Female");
        System.out.println(obj1.dogName);
        obj1.bark();


        Animal obj2 =  new Dog("Kiddo",6,"Female");
        //System.out.println(obj2.dogName); it does not allow us
        //obj2.bark();  reference type decide if its accessible
        System.out.println(obj2.gender);
        System.out.println(obj2.age);


        obj2.eat();
        obj2.methodA();

        Animal animal1= new Cat("Shorty","Male",2);

        boolean isDog = animal1 instanceof Dog;
        System.out.println(isDog);

       // boolean r1 = obj1 instanceof Cat; // there is no IS A relation between dog and cat, so we have error

        Animal animal2 = new Cat("Q","F",3);

        boolean r2 = animal2 instanceof Animal;

        System.out.println(r2);






    }
}
