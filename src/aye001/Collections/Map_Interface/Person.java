package aye001.Collections.Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class Person {

        String name;
        int age;
        public Person(int Age, String Name){
            this.name = name;
            this.age = age;
        }


    public static void main(String[] args) {


        Person p1 = new Person (25,"bla");
        Person p2 = new Person (26, "bla-bla");
        Map<Object,Object> map = new HashMap<>();

//        map.put(p1);
//        map.put(p2);

        System.out.println(map);
    }

}
