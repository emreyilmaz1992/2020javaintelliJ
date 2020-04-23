package day04_JavaRecap;

public class LeapYear {
    public static void main(String[] args) {
        short year = 2020;
        // leapyear has to be devisible by 4 with no remainer.

        boolean leapyear = year % 4 == 0 ;
        String result = year + " is leap year: "+ leapyear;
        System.out.println(result);

        int number = 65;
        boolean dvd = number % 2 == 0 ;
        System.out.println(number+( " is devisible by 2: "+(65 % 2 ==0)));
        System.out.println(number+( " is devisible by 3: "+(65 % 3 ==0)));
        System.out.println(number+( " is devisible by 5: "+(65 % 5 ==0)));

        number = number +15;

        System.out.println(number+( " is devisible by 2: "+(80 % 2 ==0)));
        System.out.println(number+( " is devisible by 3: "+(80 % 3 ==0)));
        System.out.println(number+( " is devisible by 5: "+(80 % 5 ==0)));













    }






}
