package day13_StringClass;
/*2. write a java program that can convert any given numbers between 0 ~ 9 to words,
        if the number is greater than 9 or less than zero, out put should be "Invalid".
        MUST use Scanner and switch statement

        2. write a program for the shipping info that, the program should ask:
        building number
        Street address (Assume it has more than one word)
        city name
        state name
        zip code
        full name of the person:
        and prints the ship to info in the following format:
        ex output:
        Ship To:  Jimmy joe
        7925 Jones Branch Dr
        MCLean, VA 22102

 */

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0-9");
        int num = input.nextByte();
        String result = "";

        switch (num){
            case 0:
                result = "Zero";
                break;
            case 1:
                result = "One";
                break;
            case 2:
                result = "Two";
                break;
            case 3:
                result = "Three";
                break;
            case 4:
                result = "Four";
                break;
            case 5:
                result = "Five";
                break;
            case 6:
                result = "Six";
                break;
            case 7:
                result = "Seven";
                break;
            case 8:
                result = "Eight";
                break;
            case 9:
                result = "Nine";
                break;
            default:
                result = "Invalid";

        }
        System.out.println(result);

        input.close();













    }




















}

