package day29_Wrapper_ArrayList;

import java.util.Arrays;

public class _04_valueOf_Method {
    public static void main(String[] args) {

        String str = "123";

        Integer a = Integer.valueOf(str); // Integer
        System.out.println(a);

        double b =  Integer.valueOf(str); // unboxing
        //double = Integer
        System.out.println(b);

        String str2 = "15.5";
        double d1 = Double.parseDouble(str2);
        //double = double  //none

        double d2 = Double.valueOf(str2);
        // double = double // Unboxing

        System.out.println(d1==d2); //true you can use both valueOf and parse for primitives
        System.out.println("===============================");

        String r1 = "true";
        Boolean t1 = Boolean.valueOf(r1); // Boolean, true
                        // Boolean = Boolean // none

        boolean t2 = Boolean.valueOf(r1);
                        //boolean = Boolean // unboxing

        System.out.println(t1);
        System.out.println(t2);


        System.out.println("==================================");

        int maxNum = Integer.MAX_VALUE;
        System.out.println(maxNum);

        int minNum = Integer.MIN_VALUE;
        System.out.println(minNum);

        System.out.println("==================================");


        boolean [] arr = new boolean[3];
        System.out.println(Arrays.toString(arr));

        Boolean [] arr2 = new Boolean[3]; //default is null









    }
}
