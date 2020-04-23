package day12_JavaRecap;
import java.util.Scanner;
public class Replit_Patient_Info {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String adress = "";
        String fullName = "";
        String contacts = "";

        System.out.println("Welcome to the patient portal!\nPlease enter your personal information\nEnter your first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();
        fullName +=lastName+", "+firstName;

        System.out.println("Enter your email");
        String email = scan.next();


        //System.out.println("Enter your building number");
        //int bNumber = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter your street");
        String street = scan.nextLine();
        adress =street+", ";

        System.out.println("Enter your city");
        String city = scan.next();
        adress +=city+", ";

        scan.nextLine();
        System.out.println("Enter your state");
        String state = scan.nextLine();
        adress += state+" ";

        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();
        adress +=zipCode;

        System.out.println("Enter your work phone number");
        long workPhoneNumber = scan.nextLong();
        contacts += "work phone number - "+workPhoneNumber+", ";

        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = scan.nextLong();
        contacts+="personal phone number - "+personalPhoneNumber+", "+"email: "+email;

        System.out.println("Enter your age");
        int age = scan.nextInt();

        System.out.println("Enter your height");
        double height = scan.nextDouble();

        System.out.println("Enter your weight");
        double weight = scan.nextDouble();

        System.out.println("Are you married?");
        boolean isMarried = scan.nextBoolean();

        System.out.println
                ("Patient personal information");
        System.out.println
                ("Full name: "+fullName);
        System.out.println
                ("Address: "+adress);
        System.out.println
                ("Contacts: "+contacts);
        System.out.println
                ("Age: "+age);
        System.out.println
                ("Height: "+height);
        System.out.println
                ("Weight: "+weight+" pounds");
        System.out.println
                ("Married?: "+isMarried);

    }
}
