package day50_Polymorphism;

public final class Dog extends Animal { //3 var 3 methods

    public String dogName;

    public Dog(String dogName,int age, String gender){
        this.dogName = dogName;
        this.gender = gender;
        this.age = age;
    }

    public void bark(){
        System.out.println("Dog "+dogName+" is barking");
    }

    public void eat(){
        System.out.println("Dog "+dogName+" is eating");
    }

    public void sleep(){
        System.out.println("Dog "+dogName+" is sleeping");
    }




}
