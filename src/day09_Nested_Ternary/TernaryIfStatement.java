package day09_Nested_Ternary;

public class TernaryIfStatement {
    public static void main(String[] args) {

    int num = 100;
    String result = "";


    if(num % 2 ==0){
        result = "Even";
    }else{
        result = "Odd";
    }

    String result2 = (num % 2 == 0) ? "\nEven" : "\nOdd";

        System.out.println(result);
        System.out.println(result2);
        // if the if statement is only returning value and assigning it to variable then we can apply ternary
        // in ternary: ? means "if" ,  : means " else.
        System.out.println("++++++++++++++++++++++++++++++++++++");


        int num1 = 100;
        int num2 = 200;
        int max  = 0;

        if(num1 > num2){
            max = num1;
        }else{
            max = num2;
        }


        int max2 =(num1 > num2) ? num1 : num2 ;

        System.out.println(max);
        System.out.println(max2);

        System.out.println("++++++++++++++++++++++++++++++++++++");


        String str = "";
        if(true){
            str = "Hello";
        }else {
            str = "Hola";
        }

        String str2 = (true) ? "Hello" : "Hola";

        System.out.println(str2);


        int age =  20 ;

        //String eligiblity; //to buy alcohol

        String elegibility =(age >= 21) ? "You can buy Alcohol " : "You cannot buy alcohol";
        System.out.println(elegibility);

        System.out.println("++++++++++++++++++++++++++++++++++++");

        int ageOfperson = 20;

        String vote = (ageOfperson>=18) ? "Yes" : "False";
        System.out.println(vote);
















    }
}
