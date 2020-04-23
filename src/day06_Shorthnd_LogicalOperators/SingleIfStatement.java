package day06_Shorthnd_LogicalOperators;

public class SingleIfStatement {
    public static void main(String[] args) {

        boolean coldWeather = true;
        if(coldWeather) {
            System.out.println("Wear your jacket");
            System.out.println(", wear your coat!");
        }


        boolean coronaDetected = false;
        if(coronaDetected){
            System.out.println("Buy more toilet papers"); // it doesn't get executed

        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");

        int a = 100;
        boolean evenNumber = a % 2 == 0;
        boolean oddNumber = a % 2 != 0;

            if(evenNumber){
                System.out.println(a+" is even number = "+evenNumber);

            }
            if(oddNumber){
                System.out.println(a+ " is oddNumber");



            }











    }
}
