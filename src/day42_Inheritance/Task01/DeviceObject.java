package day42_Inheritance.Task01;

public class DeviceObject {
    public static void main(String[] args) {



        TV tv1 = new TV("Samsung","E250",500,"55'' ");
        tv1.country = "USA";
        System.out.println(tv1);

        Phone phone1 = new Phone("Iphone","11",1000,"5.8 inch");
        System.out.println(tv1);


    }
}
