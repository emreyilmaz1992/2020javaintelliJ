package day33_Custom_Class;

public class BankAccount {


    String accountHolder;
    long accountNumber;
    double balance;


    public void checkingBalance() {

        System.out.println("Available Balance: " + balance);

    }

    public void withDraw(double amount) {

        System.out.println("Withdrawing $"+amount);
        balance -= amount;
    }

    public void deposit(double amount){
        System.out.println("Depositing $"+amount);
        balance += amount;
    }

    public String toString(){
        String result = "Account Holder: "+accountHolder+"\nAccount Number: "+accountNumber
                +"\nAvailable Balance: "+balance;
        return result;
    }










}
