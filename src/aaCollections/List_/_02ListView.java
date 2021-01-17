package aaCollections.List_;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _02ListView {
    public static void main(String[] args) {

        List<Double> lst = new LinkedList<>(Arrays.asList(3d,4d,27d,66d,3d,3d,44d));

        // part of your original list object

        //subList(from, to)

        System.out.println(lst.subList(2, 5)); // 2 included , 5 excluded

        List<Double>partOfListView = lst.subList(2,5);
        partOfListView.set(0,199d);
        System.out.println(partOfListView);

        System.out.println(lst); // original list will be changed too




    }
}
