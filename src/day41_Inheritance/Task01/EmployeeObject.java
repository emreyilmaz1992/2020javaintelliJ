package day41_Inheritance.Task01;

public class EmployeeObject {

    public static void main(String[] args) {
        Developer dev1 = new Developer(120000,"Sahin",1234,"Software Developer",'M');
        dev1.coding();

        System.out.println(dev1);
        System.out.println("======================");

        Tester tester1 = new Tester("Emre",130000,1816,"SDET",'M');
        tester1.reporting();
        tester1.testing();
        System.out.println(tester1);
        System.out.println("======================");

        BusinessAnalyst Analyst1 = new BusinessAnalyst(90000,"Mehmet",1256,"Business Analyst",'M');

        Analyst1.gathering();
        Analyst1.writingReq();
        System.out.println(Analyst1);



    }
}
