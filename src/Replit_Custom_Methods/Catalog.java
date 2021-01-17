package Replit_Custom_Methods;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Arrays;

public class Catalog {
    public ArrayList<String> items = new ArrayList<>();
    public ArrayList<Double> prices = new ArrayList<>();
    public ArrayList<Double> monthlyPayments = new ArrayList<>();

    public void loadItems() {

        items.addAll(Arrays.asList("iPhone 6s",
                "iPhone 6s Plus",
                "iPhone X",
                "MacbookPro",
                "ThumbDrive",
                "Beats HeadPhones",
                "Mouse",
                "Charger",
                "iPad",
                "Dyson Vacuum",
                "TV",
                "Apple Watch"));
    }
    public void loadPrices() {
        prices.addAll(Arrays.asList(449.0,
        549.0,
        1149.0,
        1499.99,
        39.99,
        349.99,
        79.99,
        39.99,
        429.0,
        399.0,
        2199.0,
        559.0));
    }
    public void loadMonthlyPayments() {
        monthlyPayments.addAll(Arrays.asList(18.71,
        22.88,
        56.16,
        79.49,
        2.68,
        15.12,
        8.98,
        4.56,
        18.31,
        16.25,
        89.49,
        21.18));
    }
    public void loadWholeCatalog(){
        loadItems();
        loadPrices();
        loadMonthlyPayments();

    }
    public StringBuilder getWholeCatalog() {
       loadWholeCatalog();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < items.size(); i++) {
            str.append(items.get(i) + "-" + prices.get(i) + "-" + monthlyPayments.get(i) + "\n");
        }
        return str;
    }

   public String getItemDetails(String item){
        getWholeCatalog();

       for (int i = 0; i <items.size() ; i++) {
           if(items.get(i).equalsIgnoreCase(item)){

               return items.get(i)+"-"+prices.get(i)+"-"+monthlyPayments.get(i);
           }

       }

        return null;
   }
   public ArrayList<String> getItemLessThanAMonthlyPrice(double price){
        getWholeCatalog();
        ArrayList<String> list = new ArrayList<>();

       for (int i = 0; i <items.size() ; i++) {

           if(monthlyPayments.get(i) <= price){

                list.add(items.get(i)+"-"+prices.get(i)+"-"+monthlyPayments.get(i));
           }

       }

       return list;
    }

    public void updatePrice(String item, double newPrice) {

      getWholeCatalog();
       for (int i = 0; i <items.size() ; i++) {

            if(items.get(i).equalsIgnoreCase(item)){
                prices.set(i,newPrice);
                monthlyPayments.set(i,newPrice/12);

            }

        }
    }

    public void deleteItemFromCatalog(String item) {
       getWholeCatalog();

        for (int i = 0; i <items.size() ; i++) {

            if(items.get(i).equalsIgnoreCase(item)){
                items.remove(i);
                prices.remove(i);
                monthlyPayments.remove(i);
            }

        }


    }









    }

    class DriveWealth{
        public static void main(String[] args) {

            Catalog ctl = new Catalog();
            ctl.loadItems();
            ctl.loadPrices();
            ctl.loadMonthlyPayments();

            System.out.println(ctl.items.toString());
            System.out.println(ctl.prices.toString());
            System.out.println(ctl.monthlyPayments.toString());

            Catalog ctl2 = new Catalog();
            ctl2.loadWholeCatalog();
            System.out.println(ctl2.getWholeCatalog().toString().trim());




        }
    }
