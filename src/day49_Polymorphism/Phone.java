package day49_Polymorphism;

interface  downloadable{

    boolean downloadable = true; // public static final
    void download(); // public abstract
}

interface AndroidApps extends downloadable{

    String AppStoreName = "Android";  // interface is final by default, so we have to initialize it right away
}


interface AppleApps extends downloadable{
    String AppStoreName ="Apple";

}


public abstract class Phone {

    public static String brand;
    public String model;
    public double price;
    public String size;

    public abstract void texting(long phoneNumber);
    public abstract void calling(long phoneNumber);

    public String toString(){
        return "Brand: "+brand+", Model: "+model+", Size: "+size+", Price: "+price;
    }
}
