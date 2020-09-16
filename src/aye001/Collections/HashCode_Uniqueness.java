package aye001.Collections;

import aye001.Comparison_Comparable.Person;

import java.util.HashSet;
import java.util.Set;

public class HashCode_Uniqueness {
    public static void main(String[] args) {

        System.out.println(new String("Adam").hashCode());
        System.out.println("Adam".hashCode()); // hashCode always the same if the value is the same

        String a = new String("Adam");
        String b = "Adam";
        System.out.println(a.equals(b));
        System.out.println(a == b);

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());



        Set<String> strSet = new HashSet<>();
        strSet.add("Adam");
        strSet.add("John");
        strSet.add("Adam");
        strSet.add("Adam");  // first it's check the hashCode when it sees the hascodes are the same so it does not
        strSet.add(new String("Adam"));   //  does not accept the duplicate value
        strSet.add(a);
        strSet.add(b);

        System.out.println(strSet);

        /*
         *HashCode   | Value
         * 2035361   | Adam
         * 2314539   | John
         */
        // HashSet internally work as hash map and store key value pair. Value and its hashcode


        Set<Person> pSet = new HashSet<>();
        Person p1 = new Person("john",20);
        Person p2 = new Person("john",20);
        Person p3 = new Person("john",20);
        pSet.add(p1);
        pSet.add(p2);
        pSet.add(p3);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());




        // since the hashcode and equal method are not overridden whenever we create an object we get a different unique hascode
        // everytime compile takes it as a new object without looking at the object's content
        // object version of hashCode always give different hashCode number. Cuz they stored in the different memory


        System.out.println(pSet);
        System.out.println(pSet.size());
        // The result is normally 3, but when override the hashcode and the equals method , each object that have the same values
        // will be treated as same . So there won't be any duplication since we are using the Set interface
        // And the final result for pset.size() will be 1!

        System.out.println(p1.equals(p2));
        System.out.println(p1 == p2);


    }
}
