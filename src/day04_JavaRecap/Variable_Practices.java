package day04_JavaRecap;

public class Variable_Practices {
    public static void main(String[] args) {
        byte num1 = 127;
        short num2 = num1; //double > float > long > short > byte
        //byte num3 = num; error
        int num4 = num2;
        long num5 = 99999999999l;
        float num6 = 100L;
        System.out.println(num6); //100.0
        System.out.println(num4); //127

        float num7 = 0.5f;  //by the compiler its prefered as double.
        System.out.println(num7); //0.5

        double num8 = 0.5f;
        double num9 = 9999l; // prints it as decimal
        double num10 = 100.5;
        System.out.println(num9);

        char ch1 = '$';
        System.out.println(ch1); //9

        char ch2 = 22000; //0 to 65565
        System.out.println(ch2); // 嗰

        int a1 = '8';
        System.out.println(a1); //56


        char ch3 = 56;
        System.out.println(ch3);

        int ch4 = '9';

        System.out.println("==========================================");


        int ch10 = 'D';
        char ch11 = 68;
        int a2 = 'z'; //122
        float a3 = 'z'; //122.0
        char ch5 = 'z'; //z
        char ch7 = 'P'; //P
        int ch8 = 'P'; //80
        char ch9 = 80; //P
        System.out.println(a2); //122
        System.out.println(ch5); //z
        System.out.println(ch7); //P
        System.out.println(ch8); //80
        System.out.println(ch9); //P
        System.out.println(a3); //122.0
        System.out.println(ch10); //68
        System.out.println(ch11); //D

        System.out.println("==========================================");

        double d1 = 'z'+ '8';
        System.out.println(d1); //178.0

        char ch6 = 'z'+'8';
        System.out.println(ch6); //²

        boolean bool1 = true ;
        boolean bool2 = false ;

        System.out.println(9 >10); //false
        System.out.println(9>=9); //true
        System.out.println(9 != 10); //true
        System.out.println('a' == 'b'); //// false
        System.out.println('a' == 'b'-1);//true
                        //(97==98-1)


        //System.out.println('a' == "a"); // "" does not match with ''

        System.out.println( "Muhtar" == "Good Guy");//false


        System.out.println( "Muhtar" != "Good Guy"); //true

        //System.out.println( "MUHTAR" = "muhtar"); //false cuz JAVA is case sensetive
        //System.out.println("Cybertek"== 10000); //false

        System.out.println(!true ==false);

















    }
}
