package Interview_Questions2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_RemoveSomeValues {
    public static void main(String[] args) {

        //Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

        list1.removeIf(p->p>100);
        System.out.println(list1);


    }
}
