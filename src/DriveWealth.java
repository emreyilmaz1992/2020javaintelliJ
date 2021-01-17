import java.lang.reflect.Array;
import java.util.*;

public class DriveWealth {

    public static void main(String[] args) {
    Calendar cal = Calendar.getInstance();


        int month = cal.get(Calendar.MONTH);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        int dayOfWeekInMonth = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);

        System.out.println(month);
        System.out.println(dayOfWeek);
        System.out.println(dayOfMonth);
        System.out.println(dayOfWeekInMonth);
        System.out.println("----------------------------------");

        System.out.println(month==10);
        System.out.println(dayOfWeek); //sunday
        System.out.println(dayOfMonth);
        System.out.println(dayOfWeekInMonth ==5); // means 5th Sunday of the month
        System.out.println(month == Calendar.NOVEMBER);



    }
    public static boolean isMarketOpenOnDate(Date date)
    {
        // The markets are closed on the following days
        // Weekends d
        // New Year's Day d
        // Martin Luther King Day d
        // President's Day d
        // Good Friday
        // Memorial Day d
        // Independence Day d
        // Labor Day d
        // Thanksgiving d
        // Christmas d
        // If one of the holidays falls on a Saturday it is observed on the preceeding  Friday
        // If it falls on a Sunday it is observed on the following Monday
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int month = cal.get(Calendar.MONTH);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        int dayOfWeekInMonth = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        // Weekend
        if (dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY) { // RIGHT
            return false;
        }
        // New Year's Day
        if (month == Calendar.JANUARY && dayOfMonth == 2) { // WRONG Should be 1 and should check weekends
            return false;
        }
        // Martin Luther King Day
        if (month == Calendar.JANUARY && dayOfWeekInMonth == 3 && dayOfWeek ==  Calendar.MONDAY) { //RIGHT
            return false;
        }
        // President's Day
        if (month == Calendar.FEBRUARY && dayOfWeekInMonth == 3 && dayOfWeek ==  Calendar.MONDAY) { //RIGHT
            return false;
        }
        // Good Friday (uses lunar calendar calculations)
//        if (isGoodFriday(date))
//            return false;

        // Independence Day
        if (month == Calendar.JULY && dayOfMonth == 4) { //WRONG should check if it falls on weekend
            return false;
        }
        // Labor Day
        if (month == Calendar.SEPTEMBER && dayOfWeekInMonth == 1 && dayOfWeek ==  Calendar.MONDAY) { //RIGHT
            return false;
        }
        // Thanksgiving
        if (month == Calendar.NOVEMBER && dayOfWeekInMonth == 4 && dayOfWeek ==  Calendar.THURSDAY) { //RIGHT
            return false;
        }
        // Christmas
        if (month == Calendar.DECEMBER && dayOfMonth == 25) {  //WRONG should check if it falls on weekend
            return false;
        }
        // Otherwise the market is open
        return true;

    }


}
















