package day50_Polymorphism;

import Replit_Custom_Methods.Calc;

public final class  Cat extends Animal { //3var/ 3 ins methods

    public String catName;

    public Cat(String catName, String gender, int age){
        this.catName = catName;
        this.gender= gender;
        this.age= age;
    }

    public final void scratch(){
        System.out.println("Cat "+catName+" is scratching");

    }

    @Override
    public void eat(){
        System.out.println("Cat "+catName+" is eating");
    }

    @Override
    public void sleep(){
        System.out.println("Cat "+catName+" is sleeping");
    }

//    @Override
//    public String toString() {
//        return "Cat Name: "+catName+" Gender: "+gender+" Age: "+age;
//    }
}
