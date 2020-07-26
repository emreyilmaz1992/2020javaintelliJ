package day49_Polymorphism;

interface Animal{

}

class Dog implements Animal{  // we cant create object from abstract class



}

class Cat implements Animal{

}

class Robot{

}



public class Polymorphism_Intro {

    public static void main(String[] args) {

        Animal obj2 = new Dog();
        Animal obj3 = new Dog();

        Dog obj5 = new Dog();
        Cat obj6 = new Cat();



        Robot obj7  = new Robot();


        Animal[] animalShow = {obj5,obj6};

       

    }



}
