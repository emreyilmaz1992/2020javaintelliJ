package day33_Custom_Class;

public class Cat {

    String breed;
    String color;
    int age;
    String name;


    public void sleep(){

        System.out.println(name+" is sleeping");
    }

    public void eat(String catFood){

        System.out.println(name+" is eating "+catFood);
    }

    public void drink(String catDrink){

        System.out.println(name+" is drinking "+catDrink);
    }
    public void setCatInfo(String catBreed, String catColor,int catAge, String catName){
        breed = catBreed;
        color = catColor;
        age = catAge;
        name = catName;
      //  System.out.println( name+", breed is "+breed+", color is "+color+", age is "+age);

    }

   public String toString(){
        return name+", breed is "+breed+", color is "+color+", age is "+age;
    }









    public static void main(String[] args) {


    }
}
