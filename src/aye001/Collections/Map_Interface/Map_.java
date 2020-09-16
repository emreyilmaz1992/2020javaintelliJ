package aye001.Collections.Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class Map_ {
    public static void main(String[] args) {


        // not a sub interface of collection
        // no duplicate key

        Map<String, Integer> scoreMap = new HashMap<>();

        // int size
        System.out.println(scoreMap.size());

        //v put (K key, V value)
        scoreMap.put("Adam",90);
        scoreMap.put("John",92);
        scoreMap.put("Mary",100);
        System.out.println(scoreMap);


        //v get(key)
        System.out.println("Mary's score is "+scoreMap.get("Mary"));
        System.out.println(scoreMap.get(2)); // map does not have index number

        //boolean isEmpty();
        System.out.println("Map is empty "+scoreMap.isEmpty());

        //boolean containsKey(Object Key)
        System.out.println("Is John in this score map? "+scoreMap.containsKey("John")); // you need to put entire key not like Joh

        //duplicate key
        scoreMap.put("Mary",30);
        System.out.println(scoreMap); // when you put the same key it just updates the value

        System.out.println(scoreMap.containsValue(30));

        // remove(Object key)

        System.out.println("removing key: Adam "+ scoreMap.remove("Adam"));
        System.out.println(scoreMap);

        //bulk operation
        // void putAll(Map<? extends K, ? extends V>m);
        Map<String ,Integer> scoreMap2 = new HashMap<>();
        scoreMap2.put("Diana", 80);
        scoreMap2.put("Alex",92);
        scoreMap2.put("Brian",70);
        System.out.println("scoreMap2 = " + scoreMap2);

        scoreMap.putAll(scoreMap2);
        System.out.println("scoreMap = " + scoreMap);
        // no insertion order for hashMap

        //void clear - deleting everything
        scoreMap2.clear();
        System.out.println("scoreMap2 = " + scoreMap2);

        scoreMap.putIfAbsent("Mary",100);
        System.out.println("scoreMap = " + scoreMap);
        //it's added if the key does not exist

        // V getOrDefault(object key, V defaultValue)
        System.out.println("Get xavi's score "+ scoreMap.get("Xavi"));
        System.out.println("Get Xavi's score, if not found return : 60 "+ scoreMap.getOrDefault("Xavi", 60));

        //boolean remove(object key, object value)
        System.out.println("Remove Brian score: "+scoreMap.remove("Brian",70)); // checks both parameter
        System.out.println("scoreMap = " + scoreMap);

        // replace(K key, V value,V newValue) returns boolean

        System.out.println("Replace Mary score from 30 to 100 "+ scoreMap.replace("Mary",30,100));
        System.out.println("scoreMap = " + scoreMap);

        //boolean ( key, V new value)
        System.out.println("Replace Mary's score "+ scoreMap.replace("Mary", 45));
        System.out.println("scoreMap = " + scoreMap);



        










    }
}
