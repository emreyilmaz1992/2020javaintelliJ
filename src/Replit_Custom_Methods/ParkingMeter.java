package Replit_Custom_Methods;

import java.lang.reflect.Member;

public class ParkingMeter {

    int timeLeft = 0;
    int maxTime;


    public ParkingMeter(int maxTime) {
        this.maxTime = maxTime;
    }

    public boolean add(int time) {

        if (time == 25) {
            if (timeLeft <= maxTime)
                timeLeft += 30;
            return true;
        }
        return false;
    }

    public void tick() {

        if (timeLeft > 0) {

            timeLeft--;
        }

    }

    public boolean isExpired() {

        if (timeLeft == 0) return true;
        return false;
    }
}
class meter{
    public static void main(String[] args) {


        ParkingMeter meter1 = new ParkingMeter(30);

        meter1.add(25);
        System.out.println(meter1.timeLeft);


    }

}








