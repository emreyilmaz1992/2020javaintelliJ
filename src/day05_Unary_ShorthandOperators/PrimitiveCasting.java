package day05_Unary_ShorthandOperators;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class PrimitiveCasting {
    public static void main(String[] args) {

       // Everything below is implicit casting  and done by automatically.

        int a = 10;
        long b = a; //b =10L   implicit casting done automaticaly.

        //int c =b; // we get an error.

        int a1 = 100;
        long b1 = (long) a1; //manual doing implicit casting.



        //Explicit Casting

        int Inum = 100;
        byte Bnum = (byte)Inum;

        short Snum = (short)(Inum);

        double Dnum = 5.5;
        float Fnum = (float)(Dnum);

        System.out.println(Fnum+1); //5.5

        float Fnum2 = (int)Dnum;
        System.out.println(Fnum2); //5.0

        double D1 = 10.5;
        long L2 = (int)D1;
        System.out.println(L2); //10


        float F1 = 60.5f;
        int I1 =(int)F1; //60

        long largeNum = 9999999999L;
        int intNum = (int) largeNum;
        System.out.println(intNum); //its called byte calculation cuz it;s out of int range"

        char ch1 = 'a';
        short sh1 = (short)ch1;
        System.out.println(sh1); //97

        char ch2 = 23456;
        double dbl1 = ch2; //23456.0

        int z1 = 10;

        double t1b= z1; //10.0

        short y1 = (short)z1; //10





    }
}
