package Replit_Custom_Methods;

public class Telephone {
    String number;
    public static int quantity = 250;
    public static double total = 15658.92;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public static void main(String[] args) {

        Telephone phone = new Telephone();

        phone.setNumber("42123414");
        System.out.println(phone.getNumber());




    }
}
