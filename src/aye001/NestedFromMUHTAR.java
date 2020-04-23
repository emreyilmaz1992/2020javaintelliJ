package aye001;

public class NestedFromMUHTAR {
    public static void main(String[] args) {

        /*
        declare a int variable called age;
        declare a boolean variable "Good Person"


        if goodperson is false
        age >= 18 -> cigarette
        age >= 21 -> hookah
        age >= 25 -> alcohol
        age <  18 -> milk

        age = 23

        else= bad for your health

         */
        int age = 43;
        boolean GoodPerson = false;

        if(age >= 18){
            if(GoodPerson){
                System.out.println("Good people don't drink alcohol");
            }
            else{
                System.out.println("You can buy Cigarette!");
                if( age>= 21){
                    System.out.println("You can buy Hookah!");
                }if( age >=25){
                    System.out.println("You can buy Alcohol");
                }
            }















        }else{
            System.out.println("Go buy milk Dude!!");
        }











    }
}
