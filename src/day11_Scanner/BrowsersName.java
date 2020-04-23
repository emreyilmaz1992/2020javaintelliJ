package day11_Scanner;

/* 1. Declear string variable calld BrowserNmae
    2. ASSUME THAT THE VALID BROwsersaare: chrome. firefox, opera, safari
    3. if the browser name does not match with the valid browser names, output should be : invalid browser name

    note: do not use scanner or iif statement or ternary for this task
 */

public class BrowsersName {
    public static void main(String[] args) {

        String browserName = "chrome"; //Chrome, chrome

        switch (browserName){

            case"chrome":  //in case if we miss type
            case "Chrome":
                System.out.println("Chrome is opening....");
                break;
            case "firefox":
            case "Firefox":
                System.out.println("Firefox is opening....");
               // break;
            case "Opera":
                System.out.println("Opera is opening....");
                break;
            case "Safari":
                System.out.println("Safari is opening...");
               // break;
            default:
                System.out.println("Invalid browser name! Please use a valid browser name!");

        }






    }
}
