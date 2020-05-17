package day40_Encapsulation;

public class PersonObject {

    public static void main(String[] args) {

        Person Zarina = new Person("Zarina");

        System.out.println(Zarina.name);
       //  System.out.println(Zarina.SSN); this is private now


        Zarina.setSNN(1234344);
        System.out.println("Zarina SSN: "+Zarina.getSNN());

        Zarina.setID(14123123);
        Zarina.setID(56677882);
        System.out.println("Zarina ID: "+Zarina.getID());


    }
}
