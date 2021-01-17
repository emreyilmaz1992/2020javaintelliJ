package aaCollections.CollectionMethods;


import java.util.*;

public class Iterators {
    public static void main(String[] args) {

        Collection<Integer>coll =  new ArrayList<>(Arrays.asList(3,4,5,3,66,544,31));
        System.out.println(coll);

        // Each loop can not iterate and remove at the same time

        Iterator<Integer> myIter = coll.iterator();
        System.out.println(myIter.hasNext());
/*
        System.out.println(myIter.next()); // 3
        System.out.println(myIter.next()); // 4
        myIter.remove(); // 4 will be removed
        System.out.println(coll);

 */
        while(myIter.hasNext()){

            Integer each = myIter.next(); // call .next() only once
            if(each>10){
                myIter.remove();
            }

        }

        System.out.println(coll);


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        for (Integer each : list){
            if(list.get(each) >= 3){
                list.remove(each);
            }
        }
        System.out.println(list);

        // ConcurrentModificationException -> This exception will be received












    }
}
