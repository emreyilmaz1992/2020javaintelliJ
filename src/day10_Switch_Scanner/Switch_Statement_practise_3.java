package day10_Switch_Scanner;

public class Switch_Statement_practise_3 {
    public static void main(String[] args) {


    char ch = 'A';
    String result= ""; //ABCDINVALID

    switch(ch){

        case 'A':
            result+="A";
           // break;

        case 'B':
            result+="B";
            //break;

        case 'C':
            result+="C";
           // break;

        case 'D':
            result+="D";
           //break;

        default:
            result+="Invalid";

    }
        System.out.println(result);







    }
}
