package Replit_Custom_Methods;

public class BankAccount {








}
class SavingAccount{

    double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public SavingAccount(double interestRate){
        this.interestRate = interestRate;
    }

    public static void main(String[] args) {

        SavingAccount account = new SavingAccount(0.2);

        System.out.println(account.getInterestRate());


    }



}
