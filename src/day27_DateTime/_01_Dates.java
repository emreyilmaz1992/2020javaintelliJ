package day27_DateTime;

import java.time.LocalDate;

public class _01_Dates {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2020, 10, 25);
        System.out.println(date1);

        LocalDate birthDay = LocalDate.of(1992,8,13);
        System.out.println(birthDay);

        boolean result1 = date1.isAfter(birthDay);
        System.out.println(result1); // true

        boolean result2 = date1.isBefore(birthDay);
        System.out.println(result2); //false

        boolean result3 = birthDay.isLeapYear();
        System.out.println(result3); //true

        System.out.println("=========================================");





            LocalDate now = LocalDate.now();
        System.out.println("Today is : " +now);

        if(birthDay == now){
            System.out.println("Today is your birthday");
        }else{
            System.out.println("Today is not your birthday");
        }


        String str = now.toString();
        System.out.println(str.replace("-"," "));
        System.out.println(str);

    }
}
