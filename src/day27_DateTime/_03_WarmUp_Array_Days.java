package day27_DateTime;

import java.time.LocalDate;

public class _03_WarmUp_Array_Days {
    public static void main(String[] args) {


        String []friends = {"John", "Aaron","Daniel"};

        LocalDate JohnBD = LocalDate.of(2020,2,5);
        LocalDate AaronBD = LocalDate.of(2020,10,12);
        LocalDate DanielBd = LocalDate.of(2020,5,6);

        LocalDate[] birthDays = {JohnBD,AaronBD,DanielBd};


        for (int i = 0; i <friends.length ; i++) {

            String name = friends[i];
            LocalDate BD = birthDays[i];

            System.out.println(name +"'s birthdays is"+ BD);

        }








    }

}
