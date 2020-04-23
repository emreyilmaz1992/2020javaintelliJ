package day05_Unary_ShorthandOperators;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class PostPre {
    public static void main(String[] args) {
        // pre; changes the value immediately.

        int a = 100;
        System.out.println( ++a); //a = 101
        System.out.println(a); //101

        int b = 100;
        System.out.println(--b); //99
        System.out.println(b); //99


        // Post; first passes the current value, then eventually changes the variables' value

        int A = 100;
        A++;
        System.out.println(A); //101

        int B = 100;
        System.out.println(B--); //100
        System.out.println(B); //99
        //post pre examples
        System.out.println("++++++++++++++++++++++++++++++++++++");

        int z = 10;
        int x = ++z;

        System.out.println(x); //11
        System.out.println(z); //11

        int s = 10;
        int f = s++;  // 10, after line 34, the value of s will be increased by 1

        System.out.println(f); //10
        System.out.println(s); //11

        System.out.println(f); //3.5
        System.out.println(s); //2.5


        int num =35;
        System.out.println(num++); //35, after line 48 , value of num will be 36
        System.out.println(num--); //36, after line 49 , value of num will be 35

        ////////// POST-PRE PRACTISES /////////

        int as  = 50;
        as = --as + as++ + as-- + as++;
        //  49  + 49  + 50  + 49
        System.out.println(as);













    }
}
