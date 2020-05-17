package Replit_Custom_Methods;

public class CarpetObject {
    public static void main(String[] args) {

        Carpet carpet1 = new Carpet();
        System.out.println(carpet1.totalPrice);

        Carpet carpet2 = new Carpet(20,20,2,false);
        System.out.println(carpet2.totalPrice);

        Carpet carpet3 = new Carpet(20,20,2,true);
        System.out.println(carpet3.totalPrice);



    }
}
