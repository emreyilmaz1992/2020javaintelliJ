package aaCollections.CollectionMethods;

import com.sun.tools.corba.se.idl.InterfaceGen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class  Methods {
    public static void main(String[] args) {

        // those apply for all collection types

        Collection<Integer> coll = new ArrayList<>();
        coll.add(1);
        coll.add(2);

        // To add everything in once

        coll.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(coll);

        System.out.println(coll.size());

        System.out.println(coll.add(3)); // will return boolean if it can be added

        System.out.println(coll.isEmpty());

        System.out.println(coll.contains(2)); // return boolean

        System.out.println(coll.containsAll(Arrays.asList(3,4)));

        coll.removeAll(Arrays.asList(1,2,3)); // it will remove all the duplicated values as well
        System.out.println(coll);

        coll.addAll(Arrays.asList(1,2,3,4,5));

        coll.retainAll(Arrays.asList(1,2)); //only keep 1,2
        System.out.println(coll);

        coll.addAll(Arrays.asList(1,2,3,4));
        coll.removeIf(p->p>=3);
        System.out.println(coll);

        coll.addAll(Arrays.asList(1,2,3,4));
        Integer[] inArray = coll.toArray(new Integer[4]);
        System.out.println(Arrays.toString(inArray));












    }
}
