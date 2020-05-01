package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _01_Collection_Min_Max {
    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        int max =  Collections.max(list);
        System.out.println(max);

        int min = Collections.min(list);

        System.out.println(min);

        // return the second max and min numbers

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,2,3,4,4));
        // second max = 3
        // second min = 2

        Integer maxNum = Collections.max(numbers);
        Integer minNum = Collections. min(numbers);

        numbers.removeAll(Arrays.asList(maxNum));
        int secondMax = Collections.max(numbers);
        System.out.println(secondMax);

        numbers.removeAll(Arrays.asList(minNum));
        int secondMin = Collections.min(numbers);
        System.out.println(secondMin);





    }
}
