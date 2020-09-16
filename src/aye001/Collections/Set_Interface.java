package aye001.Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set_Interface {
    public static void main(String[] args) {


        //Unique items
        //Doesn't have index number

        Set<Long> longSet = new HashSet<>();

        longSet.add(7L);
        longSet.add(7L);
        longSet.add(7L);
        longSet.add(7L);
        longSet.add(70L);
        longSet.add(70L);

        System.out.println(longSet); // 70 ,7
        System.out.println(longSet.add(7L)); //false
        System.out.println(longSet.add(79L)); // true

        longSet.addAll(Arrays.asList(2L,3L,4L,4L,4L));
        System.out.println(longSet);



        longSet.add(null);
        System.out.println(longSet);

        if(longSet.removeIf(p ->p==null)){
            longSet.add(0L);
        } // that's the only way we can upload a value since the Set does not have index number.
            // we can also not use the get(), set() , replace() etc methods with the Set interface

        System.out.println(longSet);
        longSet.retainAll(Arrays.asList(4L,3L));
        System.out.println(longSet);


    }
}
