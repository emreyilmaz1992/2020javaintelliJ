package Repl_It0001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class _00001Empty {
    public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel){
        int result = 0;
        int concul = 0;
        for (int i = 0; i <deliveries.size() ; i++) {
            result+= deliveries.get(i);
        }
       if (result % max_fuel == 0){
           concul = result /max_fuel;

       }else if(result % max_fuel != 0) {
           concul = (result / max_fuel)+1;
       }


        return concul;
    }




    public static void main(String[] args) {

        ArrayList<Integer> fuel = new ArrayList<>();
        fuel.addAll(Arrays.asList(3,3,1,2,6));
        int a = 3;

        System.out.println(refuel_times(fuel,3));












      }

    }

