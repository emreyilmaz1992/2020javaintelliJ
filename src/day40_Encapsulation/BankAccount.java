package day40_Encapsulation;



/*
WarmUp tasks:
	create costum class called BankAccount for Bank of America' bank accounts:
			public variables:  bankName, firstName, lastName
	 		private variables: accountHolder, accountNumber, balance
	 		encapsulate all the private data
	 				(DO NOT USE SHORTCUT)
	 		create a constructor that can initialize firstName and fullName
	 				(DO NOT USE SHORTCUT)
	 		action:
	 				depositing
	 				withdrawing
	 				availablebalance
	 				toString: returns the full name and balance
 */
public class BankAccount {

    public static String bankName = "Bank of America";
    public String firstName;
    public String lastName;
    private String accountHolder;
    private long accountNumber;
    public double balance;


    public BankAccount(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.accountHolder = firstName + " " + lastName;

    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String firstName, String lastName) {
        accountHolder = firstName + " " + lastName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void depositing(int amount) {
        //balance = balance+amount; this works too
        setBalance(balance + amount);
    }

    public void withdrawing(int amount) { // we use this only, local variable(amount) is the same we'll use in the body.

        setBalance(balance - amount);
    }

    public void checkBalance() {
       // System.out.println("Available balance is: " + balance);
        System.out.println("Available balance is: " + getBalance());
    }

    public String toString() {
        return "Full Name: " + getAccountHolder() + ", Balance is: " + balance;
    }
}

    class BankAccountObject{
        public static void main(String[] args) {

            BankAccount Irina = new BankAccount("Irina", "Shayk");

            System.out.println(Irina.getAccountHolder());

            System.out.println(Irina.getBalance());
            Irina.checkBalance();

            Irina.depositing(100);
            Irina.checkBalance();

            Irina.withdrawing(50);
            Irina.checkBalance();

            System.out.println(Irina);
            Irina.depositing(20);

            System.out.println(Irina);




        }




    }








