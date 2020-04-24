package day28_DataTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _04_Date_Time_Formatter {
    public static void main(String[] args) {

        LocalDateTime dateTime1 = LocalDateTime.of(2015,12,25,11,30,45);

        System.out.println(dateTime1);

        // 12/25/2015 11:30 am , Tues


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd - hh:mm a, EEE");

        System.out.println(dateTime1.format(dtf));



    }
}
