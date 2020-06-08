package day46_final_abstract;





public abstract class Pets {
    public String name;
    public int age;
    public String color;
    public String breed;
    public char gender;

     abstract void sleep();
     abstract void eat();
     abstract void speak();

    @Override
    public String toString() {
        return "Pets{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                '}';
    }
}

class Dog extends Pets{
    public Dog(String name, int age, String color, String breed,char gender){
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.gender = gender;


    }
    public void eat(){
        System.out.println(name+"eating");
    }
    public void sleep(){

    }
    public void speak(){

    }


}

class Cat extends Pets{
    public Cat(String name, int age, String color, String breed,char gender){
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.gender = gender;


    }
    public void eat(){
        System.out.println(name+" is eating");
    }
    public void sleep(){

    }
    public void speak(){

    }
}

class Tiger extends Pets{
    public Tiger(String name, int age, String color, String breed,char gender){
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.gender = gender;


    }
    public void eat(){
        System.out.println(name+"eating");
    }
    public void sleep(){

    }
    public void speak(){

    }
}

class Test2{
    public static void main(String[] args) {

        Cat cat = new Cat("Shorty",2,"Gray", "Scottish Fold",'M');

        cat.eat();
        System.out.println(cat);




    }

}

