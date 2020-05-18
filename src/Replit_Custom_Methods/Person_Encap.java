package Replit_Custom_Methods;

public class Person_Encap {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName( String firstName){
        this.firstName = firstName;
    }


    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }


    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }


    public Person_Encap(){
        firstName = "undefined";
        lastName = "undefined";
        age = -1;

    }

    public Person_Encap(String firstName, String lastName,int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String toString(){
        return firstName+" | "+lastName+" | "+age;
    }
}

class Person_Encap_Object{
    public static void main(String[] args) {

        Person_Encap person = new Person_Encap();

        System.out.println(person.getFirstName()); //"undefined"
        System.out.println(person.getLastName());  //"undefined"
        System.out.println(person.getAge());       // -1
        System.out.println(person.toString());     //"undefined | undefined | -1"

        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(44);

        System.out.println(person.toString() ); // "John | Doe | 44"



    }
}
