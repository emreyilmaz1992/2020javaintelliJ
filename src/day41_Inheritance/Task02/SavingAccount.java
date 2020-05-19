package day41_Inheritance.Task02;

public class SavingAccount extends BankAccount {
    /*
    account number(inherited)
    accountHolder(inherited)
    balance(inherited)

    interestRate

    deposit (inherited)
    showBalance(inherited)
    toString(inherited)
     */


    public static double interestRate;

    static {
        interestRate = 0.02;
    }



}
