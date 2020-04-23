package day06_Shorthnd_LogicalOperators;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean result1 = true;
        System.out.println(!result1); //false

        boolean result2 = !(10 + 15 > 15); //false
        System.out.println(!result2); //true


        boolean result3 = !true == !false; //false


        boolean R2 = 10 >15 && 15< 13;


        boolean R4 = true != false || false == !true;
                        //true     || true     //true

        boolean R5 = true != false && !false == !true;
                        //true     &&    false     //false















    }
}
