package day42_Inheritance.Task01;
/*
create a class called TV:
				attributes: brand, model, price, country
				methods: watch, toString
 */
public class TV extends Device {

    public TV(String brand, String model, double price, String size){

        setDevice(brand, model, price,"TV",size);

    }
    public void watch(){
        System.out.println("Watching "+brand+" TV");
    }



}
