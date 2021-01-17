package Day55_Enums_Lambda.Enums;

// You can put enums outside of the class
// Enums do not have type

enum Levels{
    LOW,MEDIUM,HIGH;
}
enum Flavor{
    CHOCOLATE, VANILLA, STRAWBERRY;
}

public class _01_Enums {

    public static void main(String[] args) {

        Levels l = Levels.HIGH;

        System.out.println(l);


        Flavor flavor = Flavor.VANILLA;

        if(flavor == Flavor.VANILLA){
            System.out.println("it's vanilla");
        }





    }


}
