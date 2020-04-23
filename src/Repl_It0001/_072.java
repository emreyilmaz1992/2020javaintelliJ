package Repl_It0001;

import java.util.Scanner;

public class _072 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();




       if(email.contains("_")) {
           String FirstName = email.substring(0,email.indexOf("_"));
           String LastName  = email.substring(email.indexOf("_")+1,email.indexOf("@"));
           String domain    = email.substring(email.indexOf("@")+1,email.indexOf("."));
           String com       = email.substring(email.indexOf("."));

           System.out.println(LastName + "_" + FirstName + "@" + domain + com);

       }else{
           System.out.println(email);
       }

















       }
}
