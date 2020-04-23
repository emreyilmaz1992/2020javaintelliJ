package Repl_It0001;

import java.util.Scanner;

public class _078_Car_insurance {
    public static void main(String[] args) {
        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");


        System.out.println("Enter your name");
        name = scan.nextLine();

        System.out.println("Do you have a US driver license?");
        String answer = scan.next();
        if(answer.equalsIgnoreCase("no")){
            System.out.println("Invalid data!");
            System.exit(0);
        }

        System.out.println("Enter your zip code");
        int zipcode = scan.nextInt();
        if(zipcode == 20910 || zipcode == 20740){
            premium+= 60;
        }else if(zipcode == 22102 || zipcode == 22103){
            premium+= 30;
        }else{
            premium+= 50;
        }

        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership = scan.next();
        if(vehicleOwnership.equalsIgnoreCase("owned")){
            premium+= 10;
        }else{
            premium+= 20;
        }
        System.out.println("How is this vehicle primarily used?");
        vehicleUsage = scan.next();
        if(vehicleUsage.equalsIgnoreCase("Business")){
            premium+=50;
        }else if(vehicleUsage.equalsIgnoreCase("pleasure")){
            premium+=10;
        }else if(vehicleUsage.equalsIgnoreCase("Commute")){
            premium+=20;
        }

        System.out.println("Days Driven To Work And/Or School");
        daysDrivenToWorkOrSchool = scan.nextInt();
        premium+= (daysDrivenToWorkOrSchool*5);

        System.out.println("Miles Driven To Work And/Or School");
        milesToWorkOrSchool = scan.nextInt();
        premium+= (milesToWorkOrSchool*1);

        System.out.println("How old are you?");
        int age = scan.nextInt();

        if (age < 16) {
            System.out.println("Invalid data!");
            System.exit(0);
        }else if (age >= 16 && age <18) {
            premium+= (premium*20);
        }else if (age > 18 && age <=21) {
            premium+= (premium*6);
        }else if (age >21 && age <=25) {
            premium+= (premium*2);
        }
        System.out.println("How many year driver experience do you have?");
        int exp = scan.nextInt();

        if(exp > 0 && (age-exp>= 16)){
            premium-= ((age-exp)*5);
        }else{
            System.out.println("Invalid date!");
            System.exit(0);
        }
        System.out.println("Have you had any accidents in the last 5 years?");
        String answer2 = scan.next();
        if(answer2.equalsIgnoreCase("yes")){
            System.out.println("How many?");
            accidentsAmount = scan.nextInt();

            premium+= ((premium*0.20)*accidentsAmount);

        }
        System.out.println("Have you had continuous insurance for the past 12 months?");
        continuousInsurance =scan.next();
        if(continuousInsurance.equalsIgnoreCase("no")){
            premium+= premium*2;
        }

        System.out.println("What is the highest level of education you have completed?");
        education = scan.nextLine();
        if(education.equalsIgnoreCase("phd") || education.equalsIgnoreCase("bachelors")|| education.equalsIgnoreCase("masters")){
            premium-= premium*0.05;
        }else if (education.equalsIgnoreCase("doctors")){
            premium-= premium*0.1;
        }else if (education.equalsIgnoreCase("less than high school")){
            premium+= premium*0.05;
        }


        referenceNumber = (name.substring(0,2)+age+(name.substring(name.length()-2,name.length())+(zipcode)+(education))).toUpperCase();

        System.out.println(name+", here's your quote!\nStar Your Policy Today For: $"+premium);





















    }
}
