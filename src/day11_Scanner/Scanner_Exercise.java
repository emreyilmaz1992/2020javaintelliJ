package day11_Scanner;


// 1 ask user enter first name
// 2 ask user to enter last name
// 3 ask user employed or not
// 4 if he is employed, ask the salary
// 5 if he is not employed set the salary  "0"

// output:
// full name:
// employed status:
// salary

import java.util.Scanner;

public class Scanner_Exercise {
    public static void main(String[] args) {

        Scanner inputEmployee = new Scanner(System.in);

        System.out.println("Please enter your first name");
        String name = inputEmployee.next();

        System.out.println("Please enter your last name");
        String lastName = inputEmployee.next();
        String fullName = name + " "+ lastName;

        System.out.println("Are you employed?");
        Boolean employmetStatus = inputEmployee.nextBoolean();

        double salary = 0;
        if(employmetStatus ==true){
            System.out.println("Enter your salary");
            salary = inputEmployee.nextDouble();
        }

        System.out.println(fullName);
        System.out.println("Employed: "+ employmetStatus);
        System.out.println("Salary: "+salary);















    }
}
