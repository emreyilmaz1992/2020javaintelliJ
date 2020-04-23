package day23_Methods;

public class _03_Method_With_Parameters {

    public static void main(String[] args) {

        EligibleToBuyAlcohol(45);








    }


    public static void EligibleToBuyAlcohol(int age ){

        if(age >= 21){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Not eligible to buy alcohol");
        }


    }


}
