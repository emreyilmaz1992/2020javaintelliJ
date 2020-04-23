package day24_Methods;

public class _02_BirthYear_Calculator {

    public static void age(short birthYear){

        int currentYear = 2020;
        int age = currentYear - birthYear;

        if(age > 0&& birthYear> 1900){
            System.out.println(age);
        }else {
            System.out.println("Invalidr");
        }
    }

    public static void main(String[] args) {

       // int a = 2002;
        age((short)2002);
        printHelloCybertek();





    }

    public static void printHello(){
        System.out.println("Hello");
    }
    public static void printCybertek(){
        System.out.println("Cybertek");
    }
    public static void printHelloCybertek(){
        printHello();
        printCybertek();
    }
}
