package Replit_Custom_Methods;

public class StockObject {
    public static void main(String[] args) {


        Stock stock1 = new Stock("appl","APPLE",302,50000);

        stock1.adjustPrice(2);
        System.out.println(stock1);




    }
}
