package day41_Inheritance.Task02;

public class CheckingAccount extends BankAccount{
    /*
    create sub class of BankAccount and name it checkingAccount
			variables: accountNumber, accountHolder, balance
			methods: deposit, withDraw, showBalance

    account number(inherited)
    accountHolder(inherited)
    balance(inherited)

    withdraw

    deposit (inherited)
    showBalance(inherited)
    toString(inherited)
     */

    public void withDraw(int amount){
        balance-= amount;
    }


}
