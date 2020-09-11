package day54_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class String_VS_buffer_VS_Builder {

    public static void main(String[] args) {


        String str1 = "cybertek";

        str1.concat(" School");

        System.out.println(str1);

        System.out.println("+++++++++++++++++++++++++++++++++");


        StringBuilder builder = new StringBuilder("Cybertek");


        builder.append(" School");
        System.out.println(builder);


        System.out.println("+++++++++++++++++++++++++++++++++");

        StringBuffer buffer = new StringBuffer("Cybertek");
        buffer.append(" School");
        System.out.println(buffer);

        String   word= "ABCD";


        StringBuilder sb = new StringBuilder(word);

        sb.reverse();


        System.out.println(sb);


        String str ="What the fuck is going on here?";

        StringBuilder builder1 = new StringBuilder(str);

        System.out.println(builder1.reverse());

        returnTheString(str);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,4,4,5));

        Set<Integer>list2 = new LinkedHashSet<>();

        list2.addAll(list);

        System.out.println("list2 = " + list2);

        if(list.size()==list2.size()){
            System.out.println("True");
        }else {
            System.out.println("False");
        }







    }

    public static void returnTheString(String str){

        StringBuilder builder = new StringBuilder(str);
        System.out.println(builder.reverse());

    }
}
