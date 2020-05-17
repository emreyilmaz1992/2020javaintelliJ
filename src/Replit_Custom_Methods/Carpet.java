package Replit_Custom_Methods;

public class Carpet {

    public double width,length,unitPrice,totalPrice;

    public boolean isPersian;


    public Carpet(){

      width = 300;
      length = 300;
      totalPrice = 200;
      isPersian = false;
      unitPrice = 0;

    }

    public Carpet(double width, double length, double unitPrice,boolean isPersian){
        this.width =width;
        this.length= length;
        this.unitPrice = unitPrice;
        this.isPersian =isPersian;
        if(isPersian){
            totalPrice = 200+(width+length)*unitPrice;
        }else{
            totalPrice = (width+length)*unitPrice;
        }
    }




}
