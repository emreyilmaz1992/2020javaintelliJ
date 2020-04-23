package day02_Variables;

public class Variables {
    public static void main(String[] args) {
        /*
        Declare variablea:
            Datatype variableName = Data
         */
        byte l = 4;
        byte w = 4;
        byte area = 8;
        System.out.println(l);
        System.out.println(w);
        System.out.println(area);
        System.out.println(l*w);

        short num3 = 1000;
        System.out.println(num3);

        int n1 = 20000;
        int n2 = 10000000;
        System.out.println(n2);
        //int n3 =  // 99999999999 out of the range for int(error)

        //long n3 =  999999999 compiler takes it as 'int'(error)

        long n4 = 999999999l; //we solve the problem by adding 'l' at the end

        byte n8 = 12;
        long n9 = n8;

        double d1 = 3.5;

       // float f1 = 4.5 gives an error, cuz compiler uses double. double bigger than float.So it cant be used.
        float f2 = 5.5f;
        System.out.println(f2);
        System.out.println("========================================");

        int a1 = 3000;
        double  d2 = a1; // result is 3000.0

        long l2 = 40;
        float l3 = l2;
        System.out.println(l3);













    }
}
