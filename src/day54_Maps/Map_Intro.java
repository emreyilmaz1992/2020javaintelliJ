package day54_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Intro {
    public static void main(String[] args) {


        Map<String, Double> employeeInfo = new LinkedHashMap<>();

        employeeInfo.put("Emre",120000.0);
        employeeInfo.put("Kamuran",12000.0);

        System.out.println(employeeInfo);
        System.out.println(employeeInfo.size());

        System.out.println(employeeInfo.get("Emre")); // map does not have index number
        System.out.println(employeeInfo.get("Kamuran"));

        employeeInfo.remove("Kamuran");

        System.out.println(employeeInfo);
        System.out.println(employeeInfo.size());

        employeeInfo.put("Emre", 150000.0);
        System.out.println(employeeInfo); //
        System.out.println(employeeInfo.size()); //map does not accept duplicates, it will only take one of them

        Map<String, Integer>TeamsInfo = new LinkedHashMap<>();



    }
}