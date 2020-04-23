package day08_MultiBranchIF;

public class SeniorCitizens {
    public static void main(String[] args) {
        /*
        write a program that can define the age groups of a person

             age groups are:
                    baby (< 3 year)
                    Toddler (3 - 5),
                    Kid (6 - 9),
                    Pre-Teen (10 - 12),
                    Teenager (13 - 17),
                    Young Adult (18 - 20),
                    Adult (21 - 39),
                    Young Middle-Aged Adult (40 - 49),
                    Middle-Aged Adult (50 - 54),
                    Very Young Senior Citizen (55 - 64),
                    Young Senior Citizen (65 - 74),
                    Senior Citizen (75 - 84),
                    Old Senior Citizen (85+)
                */

                int ageGroup= 85;
                String type;

                if(ageGroup <= 3){
                    type = "baby";
                }else if(ageGroup >3 && ageGroup<=5){
                    type = "Toddler";
                }else if(ageGroup >=6 && ageGroup<=9){
                    type = "Kid";
                }else if(ageGroup >=10 && ageGroup<=12){
                    type = "Pre-Teen";
                }else if(ageGroup >=13 && ageGroup<=17){
                    type = "Teenager";
                }else if(ageGroup >=18 && ageGroup<=20){
                    type = "Young Adult";
                }else if(ageGroup >=21 && ageGroup<=39){
                    type = "Adult";
                }else if(ageGroup >=40 && ageGroup<=49){
                    type = "Yound-Middle adult";
                }else if(ageGroup >=50 && ageGroup<=54){
                    type = "Middle Aged Adult";
                }else if(ageGroup >=55 && ageGroup<=64){
                    type = "Very Young Senior Citizen";
                }else if(ageGroup >=65 && ageGroup<=74){
                    type = "Young Senior Citizen";
                }else if(ageGroup >=75 && ageGroup<=84){
                    type = "Senior Citizen";
                }else if(ageGroup >=85 && ageGroup<120){
                    type = "Old senior Citizen";
                }else{
                    type = ("No such a thing");
                }
        System.out.println("You are a "+ageGroup+" years old "+type);

                boolean eligibleToBuy = type == "Adult" || type == "Ypung-Middle adult" || type=="Middle Aged Adult";

                if(eligibleToBuy){
                    System.out.println("You can buy alcohol");
                }else {
                    System.out.println("You cannot buy alcohol");
                }





    }
}
