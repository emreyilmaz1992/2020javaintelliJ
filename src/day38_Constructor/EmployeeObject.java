package day38_Constructor;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Emre");
        System.out.println(employee1);

        Employee employee2 = new Employee("Richard","Broker");
        System.out.println(employee2);

        Employee employee3 = new Employee("Kazim","Cook",1424452);
        System.out.println(employee3);

        Employee employee4 = new Employee("Melih","Bodyguard",31241,50000);
        System.out.println(employee4);







    }




}
