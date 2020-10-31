package aye001.Collections.Map_Interface;

import java.util.SortedMap;
import java.util.TreeMap;

public class Sorted_Map {
    public static void main(String[] args) {

        SortedMap<String, Integer> scoreMap = new TreeMap<>();
        scoreMap.put("Adam",90);
        scoreMap.put("Jack",92);
        scoreMap.put("Mary",100);
        scoreMap.put("Jill",78);
        scoreMap.put("Jane",88);
        //scoreMap.put(null,100); key value cannot be null, we get nullPointerException
        scoreMap.put("JayJay",null);
        System.out.println(scoreMap);


        System.out.println(scoreMap.firstKey());
        System.out.println(scoreMap.lastKey());
        //System.out.println(scoreMap.get(1));


                // --- view ---//

        // SortedMap<K,V> subMap(K fromKey, K toKey);
        System.out.println(scoreMap.subMap("Dave","Mary"));

        // SortedMap<K,V> headMap(K toKey); // just like tailView and subSet in set interface
        System.out.println(scoreMap.headMap("Jack")); // we get everything till Jack(unInc)

        // SortedMap<K,V> tailMap(K toKey);

        System.out.println(scoreMap.tailMap("Jane")); // everything after Jane(inc)




    }
}
