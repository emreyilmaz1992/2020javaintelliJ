package day04_JavaRecap;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int a = 10 / 3; // 3

        System.out.println(a);

        System.out.println(10 / 4); // 2 cuz we use integer and it doesnt give you decimal number

        double d = 10/4;
        System.out.println(d); // 2.0

        System.out.println(10.0/4); //2.5
        System.out.println(10/4.0); //2.5

        System.out.println(10.0/4.0); //2.5

        System.out.println(10 %4); //2 remainder(bolmedeki kalan)

        boolean evenNumber = 25 % 2 == 0; //if 25 devided by 2 has reminder of 0, the its even number
        System.out.println(evenNumber);

        boolean oddNumber = 22 %2 != 0; // false ==> means 22 is not odd number

        System.out.println(10 % 2 == 0); // 10 is even number
        System.out.println(11%2 !=0); // true

        System.out.println( "10 is even number: "+ (10 % 2 ==0));

        System.out.println("25 is odd number:"+ (25 % 2 != 0));













    }
}
