package aye001.Math;

import com.sun.tools.corba.se.idl.constExpr.Xor;

public class XorBitter {
    public static void main(String[] args) {
        int[] deliveryIds = {34, 40, 2, 21, 50, 40, 34, 2, 50};



        for (int i = 0; i <deliveryIds.length ; i++) {
            int count=0;
            for (int j = 0; j < deliveryIds.length ; j++) {


                if(deliveryIds[i]== deliveryIds[j]){
                    count++;
                }

            }
            if(count==1){
                System.out.println(deliveryIds[i]);
            }

        }

        String a = new String("dog");
        String b = new String("dog");
        String c = "dog";
        String d = "dog";

        System.out.println(a.equals(b));
        System.out.println(a == b);
        System.out.println(a.equals(c));
        System.out.println(a == c);
        System.out.println("============");

        System.out.println(a.equals("dog"));
        System.out.println(a == "dog");
        System.out.println(c==d);

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());




    }





}
