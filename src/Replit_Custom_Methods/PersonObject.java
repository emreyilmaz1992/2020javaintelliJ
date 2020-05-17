package Replit_Custom_Methods;

public class PersonObject {
    public static void main(String[] args) {

        Person person1 = new Person("Emre","Yilmaz",8,8,1992,"323454323");

        System.out.println(person1.getBirthday());

        System.out.println(person1.verifySSN("323454323"));



    }
}
