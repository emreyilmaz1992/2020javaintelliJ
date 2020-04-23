package Repl_It0001;

import java.util.Scanner;

public class Email_StringMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your email");
        String email = scan.next();


        String FirsName = email.substring(0,email.indexOf("_"));
        FirsName= FirsName.substring(0,1).toUpperCase()+FirsName.substring(1).toLowerCase();
        System.out.println("First name: "+FirsName);

        String LastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
        LastName = LastName.substring(0,1).toUpperCase()+LastName.substring(1).toLowerCase();
        System.out.println("Last name: "+LastName);

        String Domain = email.substring(email.indexOf("@")+1,(email.indexOf(".")));
        System.out.println("Domain: "+Domain);

        String TLDomain = email.substring((email.indexOf(".")+1));
        System.out.println("Top-Level Domain: "+TLDomain);


    }
}
