package day41_Inheritance.Task02;

public class AccountObjects {
    public static void main(String[] args) {


        CheckingAccount obj = new CheckingAccount();
        obj.accountHolder = "Emre";

        obj.showBalance();
        System.out.println(obj);

        obj.deposit(100);
        obj.showBalance();
        obj.withDraw(50);
        obj.showBalance();

        System.out.println("======================");

        SavingAccount saving = new SavingAccount();
        saving.accountHolder ="Elif";


        System.out.println(SavingAccount.interestRate); // since its static we can call through class name
        System.out.println(saving);

        saving.deposit(3000);
        saving.showBalance();








    }
}
