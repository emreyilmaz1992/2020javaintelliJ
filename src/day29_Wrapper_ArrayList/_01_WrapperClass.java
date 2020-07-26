package day29_Wrapper_ArrayList;

import com.sun.tools.corba.se.idl.InterfaceGen;

public class _01_WrapperClass {
    public static void main(String[] args) {

        int a = 100;  // primitive

        Integer b = a; // wrapper class




        short s1 = 200;
        int n1 = s1;

        // Integer c = s1; gives us an error. Integer is dedicated to int primitive

        int a1 = 20;
        float f1 = a1;
        Float f2 = f1;

        Integer I1 = 200;
        int a2 = I1;

        Byte B1 = 126;
        int a3 = B1; // This compiles

        System.out.println(a3);

        Integer k = 200;
        System.out.println(k);




    }
}
