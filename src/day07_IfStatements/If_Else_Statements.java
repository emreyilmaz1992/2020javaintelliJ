package day07_IfStatements;

public class If_Else_Statements {
    public static void main(String[] args) {
        int number = 1;
        if(number > 0){
            System.out.println(number+" is positive");
        } else {
            System.out.println(number+" is negative ");
        }
        // else means otherwise



        int number1 = 101;
        if (number1 % 2 == 0){
            System.out.println(number1+" is even number");
        }else{
            System.out.println(number1+" is odd number");
        }

        int age = 18;

        if(age >= 21){
            System.out.println(age + " age is eligibe to buy alcohol");
        }else {
            System.out.println(age + " age is not eligible to buy alcohol");
        }

        boolean testedPositiveForCoding = true;

        if(testedPositiveForCoding){
            System.out.println("Buy more toilet papers and stay home");
        }else{
            System.out.println("Do more coding");
        }




    }
}
