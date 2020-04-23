package day09_Nested_Ternary;

public class TernaryExecises {
    public static void main(String[] args) {

        int number = 100;
        char ch1 = ' ';


        if(number > 0){
            ch1 = '+';
        }else if (number < 0){
            ch1 = '-';
        }else{
            ch1 = '0';
        }


        char ch2 = (number > 0) ? '+' : (number<0) ? '-' : '0';
        System.out.println(ch2);

        System.out.println("========================================================");


        int score = 112;
        char grade =(score <= 100 && score >=90)? 'A' : (score < 90 && score >=80) ? 'B' : (score <80 && score >= 70) ? 'C':
                (score < 70 && score>= 60)? 'D' :(score < 60 && score >= 0) ? 'F': '-';
        System.out.println(grade);



        int num1 = 100;
        int num2 = 200;
        int min = (num1< num2) ? num1 : num2;

        System.out.println(min);

        System.out.println("================================================");

        int hour = 14;

        String result = (hour <12) ? "Good Morning" : (hour > 12 && hour < 17 ) ? "Good Afternoon"
                : "Good Evening";
        System.out.println(result);

        int num= 12000;

        boolean divisible = (12000 % 5 == 0 && 12000 % 3 == 0) ? true : false ;

















    }
}
