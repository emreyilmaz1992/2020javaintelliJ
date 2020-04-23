package Repl_It0001;

import java.util.Scanner;

public class _047_Real_Estate {
    public static void main(String[] args) {

        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your property type:");
         houseType = scan.nextLine();

        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms = scan.nextInt();

        System.out.println("Do you have backyard?");
        backyard = scan.nextBoolean();

        System.out.println("Do you have garage?");
        garage = scan.nextBoolean();

        System.out.println("How many spots?");
        garageSpots = scan.nextInt();





        if(houseType.equalsIgnoreCase("Condo)")) {
            propertyPrice += 50000;
        }else if(houseType.equalsIgnoreCase("Townhouse")){
            propertyPrice+= 75000;

        }else if(houseType.equalsIgnoreCase("Single family home")){
            propertyPrice+= 95000;
        }

        if(numberOfBedrooms == numberOfBedrooms){
            propertyPrice+= numberOfBedrooms*30000;
        }

        if(backyard==true ){
            propertyPrice+= 5000;
        }




        if(backyard ==true && houseType.equalsIgnoreCase("condo")){
            System.out.println("Backyard is not available for condo!");
            propertyPrice+=0;
        }

        if(garage ==true)
            if(garageSpots>=0 && garageSpots <= 10){
            propertyPrice+= garageSpots*20000;

        }else if(garageSpots>10){
            System.out.println("Pardon it's not public parking!");
            propertyPrice+=0;
        }

        System.out.println("How close is metro station?");
        metroAccessibility = scan.nextFloat();

        System.out.println("How close is highway?");
        highwayAccessibility = scan.nextFloat();

        System.out.println("What's the rating of nearest school?");
        schoolScore = scan.nextFloat();

        System.out.println("Does any of your family members smoking?");
        smoking = scan.nextBoolean();



        if(metroAccessibility <=1){
            propertyPrice+=10000;
        }else if (metroAccessibility >1 && metroAccessibility <=3){
            propertyPrice+=5000;
        }

        if(highwayAccessibility <=1 && highwayAccessibility>=0){
            propertyPrice+=15000;
        }else if(highwayAccessibility>1 && highwayAccessibility <5){
            propertyPrice+= 8000;
        }else if(highwayAccessibility >5 && highwayAccessibility<20){
            propertyPrice+=4000;
        }

        if(schoolScore<= 10 && schoolScore>=8){
            propertyPrice+=45000;
        }else if(schoolScore<8 && schoolScore >=4){
            propertyPrice+= 20000;
        }else {
            propertyPrice+=5000;
        }

        if(smoking == true){
            propertyPrice+=0;
        }else{
            propertyPrice-=5000;
        }

        System.out.println("Market report has been generated.\nYour estimate market price is: "+propertyPrice);












    }
}
