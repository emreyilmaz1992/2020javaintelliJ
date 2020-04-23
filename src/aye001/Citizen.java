package aye001;

import java.util.Scanner;

public class Citizen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        int seniorCitizens = input.nextInt();
        int nonSeniorCitizens = input.nextInt();
        System.out.println("What is new citizen's age?");
        int citizen = input.nextInt();

        if(citizen >= 65){
            System.out.println("New seniorCitizens count "+(++seniorCitizens));
            System.out.println("New nonSeniorCitizens count "+(nonSeniorCitizens));
        }else{
            System.out.println("New seniorCitizens count "+(seniorCitizens));
            System.out.println("New nonSeniorCitizens count "+(++nonSeniorCitizens));

        }





    }

}
