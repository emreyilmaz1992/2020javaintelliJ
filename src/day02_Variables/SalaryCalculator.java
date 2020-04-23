package day02_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        double rate = 65;
        double statetax = 0.04;
        double federaltax = 0.22;
        byte weeklyhours = 45;
        double salary = rate*weeklyhours*48;
        double totaltax = salary*(statetax+federaltax);
        double salaryaftertax= salary - totaltax;
        System.out.println(salary);
        System.out.println(totaltax);
        System.out.println(salary-totaltax);
        System.out.println(salary*(1-(statetax+federaltax)));
        System.out.println(salaryaftertax);
    }
}
