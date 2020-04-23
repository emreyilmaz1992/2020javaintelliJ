package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class _02_Dates_Formatting {
    public static void main(String[] args) {


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MMM/dd"); // you can change the order
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy/MMMM/dd");

        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf));

        LocalDate date2 = LocalDate.of(1999,12,30);
        System.out.println(date2.format(dtf2));




    }
}
