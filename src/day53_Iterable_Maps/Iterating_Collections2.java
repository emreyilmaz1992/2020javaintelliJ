package day53_Iterable_Maps;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Iterating_Collections2 {
    public static void main(String[] args) {


        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Tansu","Isilay","Dilan","Sevinc","Kubra","Merve","Gamze","Isilay","Isilay","Isilay","Isilay","Melike"));
        System.out.println(names);

        Iterator<String> it = names.iterator();

        while(it.hasNext()){
           String s = it.next();
           if(s.toLowerCase().contains("m")){
               it.remove();
           }
        }
        System.out.println(names);

        for(Iterator<String> I = names.iterator(); I.hasNext(); ){

            String s = I.next();
            if(s.contains("m") || s.contains("M")){

                I.remove();
            }
        }

        System.out.println(names);

        System.out.println("==============================");
        LinkedHashSet<String> names2 = new LinkedHashSet<>();
        names2.addAll(Arrays.asList("Tansu","Isilay","Dilan","Sevinc","Kubra","Merve","Gamze","Isilay","Isilay","Isilay","Isilay","Melike"));
        System.out.println(names);

        names2.removeIf(s-> s.contains("m")|| s.contains("M"));

        System.out.println(names2);


        System.out.println("=================================");

        LinkedHashSet<String> names3 = new LinkedHashSet<>();
        names3.addAll(Arrays.asList("Tansu","Isilay","Dilan","Sevinc","Kubra","Merve","Gamze","Isilay","Isilay","Isilay","Isilay","Melike"));

        names3.retainAll(Arrays.asList("Merve","Isilay","Melike"));
        System.out.println(names3);






    }
}
