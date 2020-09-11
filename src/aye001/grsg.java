package aye001;

import java.util.*;

public class grsg {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();

        ArrayList<String> list =  new ArrayList<>();

       list.add("Emre");
       list.add("Remzi");
       list.add("Kamil");
       list.add("Cemil");
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);

        Set<Integer>seth = new TreeSet<>();
        seth.add(1);
        seth.add(1);
        seth.add(2);
        seth.add(3);
        seth.add(4);
        System.out.println(seth);
        seth.add(5);
        System.out.println(seth);

        seth.removeIf(p->p==1);

        System.out.println(seth);




    }
}
