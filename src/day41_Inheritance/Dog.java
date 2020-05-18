package day41_Inheritance;

public class Dog extends Animal {
    /*
     public String name;
    public String size;
    public double weight;

    public void eat(){  // these are actions so we use void

        System.out.println(name+" is eating");
    }

    public void move(){
        System.out.println(name+" is moving");
    }
     */

    // THOSE ARE INHERITED FROM ANIMAL CLASS

        public void bark(){
            System.out.println(name+" Goddamn dog is barking");
        }
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Shorty";

        System.out.println(dog1.name);

        dog1.move();

        dog1.bark();







    }
}
