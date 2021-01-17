import java.io.File;
import java.util.*;
import java.util.Map.Entry;

public class MyClass  {

    public static void main(String[] args) {


        File temp = new File("/Users/emre/Desktop/Vytracktestdata 2 2.xlsx");
        boolean exist = temp.exists();

        //  System.out.println(exist);


        Map<String, Integer> map = new HashMap<>();

        map.put("apple",2);
        map.put("pear",1);
        map.put("banana",2);
        map.put("apple",1);
//        System.out.println(map.get("apple"));
//        map.remove("apple");
//        System.out.println(map);



        System.out.println(map);

        Collection<Integer> values = map.values();
        List<Integer> list = new ArrayList<>(values);



        Set<Entry<String, Integer>> allEntries = map.entrySet();
        System.out.println(allEntries);

        for (Entry<String, Integer> each : allEntries){


            for (int i = 0; i < list.size() ; i++) {

                if(each.getValue() == list.get(i)){




                }


            }

        }







    }
}









