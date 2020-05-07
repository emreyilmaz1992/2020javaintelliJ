package day34_Custom_Class;

import java.util.ArrayList;
import java.util.Arrays;

public class _05_WarmUp_Offer {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("VA","BOA",100000,true);
        //System.out.println(offer1);

        Offer offer2 = new Offer();
        offer2.setInfo("NY","Goldman Sachs",120000,false);
       // System.out.println(offer2);

        Offer offer3 = new Offer();
        offer3.setInfo("CA","Apple",95000,true);

        Offer offer4 = new Offer();
        offer4.setInfo("BayArea","Google",115000,false);

        String myLocation = "VA";

        Offer[] offers = {offer1,offer2,offer3,offer4};
        ArrayList<Offer> Accept = new ArrayList<>(Arrays.asList(offers));// remove the offer if it;s less than 100k and nit full time

        Accept.removeIf( p -> p.salary< 100000 || p.isFullTime == false || !p.location.equals(myLocation));



        for(Offer eachOffer : Accept){
            System.out.println(eachOffer);
        }





    }
}
