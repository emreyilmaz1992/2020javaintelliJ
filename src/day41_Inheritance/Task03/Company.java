package day41_Inheritance.Task03;
/*
create a class called company:
					create 3 objects of employee and set their info
					create an array of employees and store all those employee objects
					use regular for loop to print out each employee' name and employeeID
 */
public class Company {

    public static Employee employee1;
    public static Employee employee2;
    public static Employee employee3;

    static {
        employee1 = new Employee();
        employee1.setEmployeeInfo("Ronn ", 32, 'M', 140_000, 13654," SDET");

        employee2 = new Employee();
        employee2.setEmployeeInfo("Ronny ", 32, 'M', 140_000, 13654,"QA");

        employee1 = new Employee();
        employee1.setEmployeeInfo("Melinda ", 32, 'M', 140_000, 13654,"SDET");

    }
    public static void main(String[] args) {

        Employee[] employees = {employee1,employee2,employee3};



        for (int i = 0; i <employees.length ; i++) {

          //  System.out.println(employees[i]);
            System.out.println(employees[i].employeeID+" "+employees[i].name);


        }











    }
}
