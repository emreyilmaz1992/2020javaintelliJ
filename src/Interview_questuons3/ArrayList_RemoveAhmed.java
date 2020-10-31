package Interview_questuons3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_RemoveAhmed {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed","John","Mike","Ahmed"));

        Iterator<String> it = names.iterator();

        while (it.hasNext()){

            if(it.next().equals("Ahmed")){
                it.remove();
            }
        }



        System.out.println(names);




    }
    public static ArrayList<String>removingName(ArrayList<String> names,String name){



        names.removeIf(p->p.equals(name));


        return names;
    }



}
