package day33_Custom_Class;

public class _06_CapitalOne {
    public static void main(String[] args) {


        BankAccount Anna =  new BankAccount();
                    Anna.accountHolder = "Anna";
                    Anna.accountNumber = 1233455;

                    Anna.checkingBalance();
                    Anna.deposit(33);
                    Anna.checkingBalance();

                    Anna.withDraw(12);
                    Anna.checkingBalance();

        System.out.println(Anna);







    }
}
