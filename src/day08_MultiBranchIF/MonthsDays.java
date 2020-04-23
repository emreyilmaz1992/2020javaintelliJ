package day08_MultiBranchIF;

public class MonthsDays {
    public static void main(String[] args) {

        /*
        2. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
            byte month =  3
            28 days: 2
            30 days: 4,6,9,11
            31 days: 1,3,5,7,8,10,12

         */

        byte months = 5;
        String result = " ";

        if(months == 1){
            result = "January has 31 days";
        }else if (months == 2){
            result = "February has 28 days";
        }else if ( months==3){
            result = "March has 31 days";
        }else if ( months==4){
            result = "April has 30 days";
        }else if ( months==5) {
            result = "May has 31 days";
        }else if ( months==6) {
            result = "June has 30 days";
        }else if ( months==7) {
            result = "July has 31 days";
        }else if ( months==5) {
            result = "August has 31 days";
        }else if ( months==5) {
            result = "September has 31 days";
        }else{
            result = "October has 30 days";
        }
        System.out.println(result);

    }
}
