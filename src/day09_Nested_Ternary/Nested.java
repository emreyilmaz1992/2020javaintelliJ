package day09_Nested_Ternary;

public class Nested {
    public static void main(String[] args) {

        boolean UScitizen = true;
        int age = 17;


        if(UScitizen) {

            if (age > 17)
            {
                System.out.println("Eligible to vote!");
            }else{
                System.out.println("You msut be older than 18 to vote!!");
            }
        }else {
            System.out.println("Only US citizens can vote!");
        }


        System.out.println("\n=====================================================");

        int score = 123;
        String grade = " ";
        if(score >= 0 && score<= 100) {
            if (score >= 90) {
                grade = "A";


            } else if( score >= 80){
                grade = "B";
            } else if (score >= 70 ){
                grade = "C";
            }else if (score >= 60){
                grade = "D";
            }else if ( score < 60 && score >= 0){
                grade = "F";
            }
        }else{
            grade = "Invalid";
        }
        System.out.println(grade);


        int score2 = 75;
        String grade2 = "";

        if(score2 >=0 && score2 <= 100) {
            grade2 = (score >= 90) ? "A" : "b";
        } else{
            grade2 = "invalid";

        }



        double salary = 1234566;
        double workHistory = 1;

        if(salary >= 30000){
            if(workHistory >= 2){
            System.out.println("You are qualified for a loan.");

            }else {
                System.out.println("You must have at least 2 years fo experience.");
            }

        }else
            System.out.println("You must earn at least 30000$.");


























    }
}
