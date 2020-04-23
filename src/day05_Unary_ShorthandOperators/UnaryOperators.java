package day05_Unary_ShorthandOperators;

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 10; // positive 10
        int b = +a; // positive 10

        int a2= -10 ;
        boolean result1 = a2 > 0; //false
        boolean result2 = a2 < 0; //true

        int x1 = -10; //-10
        int y1 = -x1; // 10

        int x2 = 20; //20
        int y2 = -x2; //-20

        int Z = 100;
        System.out.println(++Z); //101

        int P = 100;

        System.out.println( P++); //100
        System.out.println(P); //100

        int C = 100;
        C++;
        System.out.println(C); //101

        C--;
        System.out.println(C); //100


        int inputSeconds = 20394;
        int hours = inputSeconds/3600;
        int minutes = (inputSeconds%3600)/60;
        int seconds = (inputSeconds%60)%60;


        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(seconds);




    }
}
