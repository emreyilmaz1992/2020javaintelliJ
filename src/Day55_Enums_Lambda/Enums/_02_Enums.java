package Day55_Enums_Lambda.Enums;

enum CupSize{

    SMALL(25),
    MEDIUM(40),
    LARGE(110);

    private int volume;

    // enums cannot have public constructor
    CupSize(int volume){
        this.volume = volume;
    }

    //we need to create the getMethod to get volume. if we print CupSize.SMALL, result is SMALL
    //                                               if we print CupSize.SMALL.getVolume = 25
    public int getVolume() {
        return volume;
    }


}

enum Car{

    BMW("X5",2020),
    AUDI("A8",2010),
    LEXUS("C4",1990);

    private String model;
    private int year;

    Car(String model, int year){
        this.model = model;
        this.year  = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

}




class Coffee{

    private CupSize cupSize;

    public Coffee(CupSize cupSize){
        this.cupSize = cupSize;
    }

    public CupSize getCupSize() {
        return cupSize;
    }

    public void setCupSize(CupSize cupSize) {
        this.cupSize = cupSize;
    }

    @Override
    public String toString() {
        return "Coffe, cupsize: "+cupSize;
    }
}

public class _02_Enums {

    public static void main(String[] args) {

        System.out.println(CupSize.LARGE.getVolume());

        // Using the enum
        CupSize cup = CupSize.MEDIUM;
        System.out.println("Value of the cup "+cup);

        // Using the enum as a member variable inside Coffee
        Coffee coffee1 = new Coffee(CupSize.SMALL);
        System.out.println("Volume is "+coffee1.getCupSize().getVolume());
        System.out.println(coffee1);

        Coffee coffee2 = new Coffee(CupSize.LARGE);
        System.out.println(coffee2);

        System.out.println("-------------------------------------------------------");


        String car = Car.BMW.getModel();
        System.out.println(car);




    }

}
















