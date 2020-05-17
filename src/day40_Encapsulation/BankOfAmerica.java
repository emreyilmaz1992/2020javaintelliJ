package day40_Encapsulation;

public class BankOfAmerica {
    public static void main(String[] args) {


        EmployeeInfo Rick = new EmployeeInfo();

        Rick.setAddress("MidWest");
        Rick.setSalary(120000);
        Rick.setID(13123123);
        Rick.setSSN(23142312);


        System.out.println(Rick.getAddress());
        System.out.println(Rick.companyName);
        System.out.println(Rick.getSalary());
        System.out.println(Rick.getID());
        System.out.println(Rick.getSSN());





    }
}
