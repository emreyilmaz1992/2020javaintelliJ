package day34_Custom_Class;

public class Carpet {

    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public double calcCost(){
        double total = (width+length)*unitPrice;

        return (isPersian) ? total+200 : total;
    }

    public void customOrder (double carpetWith, double carpetLength, double carpetunitPrice, boolean carperPersian){

        width = carpetWith;
        length = carpetLength;
        unitPrice = carpetunitPrice;
        isPersian = carperPersian;

    }
    public String toString(){
        return "width: "+width+
                "\nlength: "+length+
                "\nunit price $"+unitPrice+
                "\nTotal costs $"+calcCost();
    }

}
