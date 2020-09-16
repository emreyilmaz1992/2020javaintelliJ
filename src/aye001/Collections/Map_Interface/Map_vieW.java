package aye001.Collections.Map_Interface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_vieW {
    public static void main(String[] args) {


        // map is not iterable

        Map<String, Integer> scoreMap = new HashMap<>();
        scoreMap.put("Adam",90);
        scoreMap.put("John",92);
        scoreMap.put("Mary",100);
        scoreMap.put("Alex",78);
        scoreMap.put("Diana",88);
        System.out.println(scoreMap);


        // Set<K> keySet();
        Set<String> keys = scoreMap.keySet();
        System.out.println(keys);

        keys.remove("Adam");
        System.out.println(scoreMap);

        // Collection<V> values();
        Collection<Integer> allScores = scoreMap.values();
        System.out.println(allScores);
        // we can't use keySet for value . we  can use Collection

        for (String eachKey : keys){

            System.out.println("key is: "+eachKey+" value: "+scoreMap.get(eachKey));
        }

        // Set<Entry<K, V> >  entrySet();

        Set<Entry<String, Integer>> allEntries = scoreMap.entrySet();
        // gotta do : import java.util.Map.Entry;

        for (Entry<String, Integer> eachEntry : allEntries){

            System.out.println("key : "+eachEntry.getKey()
            +"| value : "+eachEntry.getValue());

            if(eachEntry.getValue()<90){
                eachEntry.setValue(95);
            }
        }
        System.out.println(scoreMap);

        // since the map is not iterable , that's how we make it do iteration




    }
}
