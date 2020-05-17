package Replit_Custom_Methods;

public class StoreProductObject {
    public static void main(String[] args) {

        StoreProduct str = new StoreProduct("Console",200);
        System.out.println(str);

        StoreProduct str2 = new StoreProduct("Consele", 200, 5);
        System.out.println(str2);

        StoreProduct str3 = new StoreProduct("Console",200,"Arcade",true);
        System.out.println(str3);

        StoreProduct str4 = new StoreProduct("Eggs",200,"Produce",true,10);
        System.out.println(str4);


        str4.expired(true);

        str3.getDiscounted(0.2);
        System.out.println(str4.getDiscounted(0.2));

        //str4.sale(8);

        System.out.println("=======================");

        System.out.println(str4);






    }
}
