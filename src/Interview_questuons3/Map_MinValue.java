package Interview_questuons3;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class Map_MinValue {
    public static void main(String[] args) {

        Map<String, Integer> scoreMap = new HashMap<>();
        scoreMap.put("Adam",90);
        scoreMap.put("John",92);
        scoreMap.put("Mary",100);
        scoreMap.put("Alex",78);
        scoreMap.put("Diana",88);

        System.out.println(minValue(scoreMap));


    }
    public static int minValue(Map<String, Integer> map){

        SortedSet<Integer> set = new TreeSet<>(map.values());



        return set.first();

    }


}
