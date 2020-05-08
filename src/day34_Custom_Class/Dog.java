package day34_Custom_Class;

public class Dog {

    String breed;
    String size;
    int age;
    String color;
    String name;

    public void setDogInfo(String breed, String size, int age, String color, String name) {
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
        this.name = name;
    }


         //this is keyword is used for calling object instance(instance variables

        public String toString(){
            return "Dog Name "+name+", Breed "+breed+", Size "+size+", Color "+color+", Age "+age;
        }




    }

