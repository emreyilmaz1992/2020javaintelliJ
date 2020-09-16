package Interview_Questions2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_RemoveAhmed {
    public static void main(String[] args) {

    /*
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
     */

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed","Mehmet","ahmed"));


        names.removeIf(p->p.equalsIgnoreCase("ahmed"));
        System.out.println(names);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,1,5,6,1,7,8));

        numbers.removeIf(p->p==1);
        System.out.println(numbers);

        numbers.removeIf(p->p>5);
        System.out.println(numbers);





    }

}
