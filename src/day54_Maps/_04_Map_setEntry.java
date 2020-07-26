package day54_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class _04_Map_setEntry {
    public static void main(String[] args) {


        LinkedHashMap<String, String> countries = new LinkedHashMap<>();

        countries.put("Tajikistan", "Dushanbe");
        countries.put("Kyrgyzstan", "Bishkek");
        countries.put("East Turkistan","Urumqi");
        countries.put("USA","Washington DC");
        countries.put("Pakistan","Islamabad");


        for(Map.Entry<String, String> each : countries.entrySet()){

            System.out.println( each.getKey()+"'s capital is: "+each.getValue());


        }



    }
}
