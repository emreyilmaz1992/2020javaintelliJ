package Replit_Custom_Methods;

import java.text.DecimalFormat;

public class Stock {

    String tickerSymbol;
    String companyName;
    int price;
    double percentChange;
    int totalShares;
    long marketCap;

    public Stock(String tickerSymbol, String companyName, int price, int totalShares){
        this.tickerSymbol = tickerSymbol.toUpperCase();
        this.companyName = companyName;
        this.price = price;
        this.totalShares = totalShares;
        this.marketCap = totalShares*price;


    }

    public void adjustPrice(int value){

        int temp=price;
        price=price+(value);
        percentChange=((double)(price-temp))/temp;
        marketCap=totalShares*price;

    }



    public String toString(){

        DecimalFormat DF = new DecimalFormat("0.00");

        return "Ticker Symbol: "+tickerSymbol+
                "\nCompany: "+companyName+
                "\nCurrent Price: $"+price+" (+"+DF.format(percentChange)+"%)"+
                "\nMarket Cap: $"+marketCap;

    }







}
