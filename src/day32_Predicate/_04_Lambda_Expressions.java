package day32_Predicate;

import sun.jvm.hotspot.oops.ArrayKlass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class _04_Lambda_Expressions {
    public static void main(String[] args) {

        Predicate<Integer> oddNumber = x -> x % 2 != 0;

        ArrayList<Integer> list = new ArrayList<>();
              list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
              list.removeIf(oddNumber);

        System.out.println(list);

        System.out.println("================================");


        Predicate<Integer> lessThan5 = Y -> Y < 5;
        ArrayList<Integer> list2 = new ArrayList<>();
            list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

            list2.removeIf(lessThan5);
        System.out.println(list2);


        System.out.println("================================");


        Predicate<String> startsWithA = A -> A.toLowerCase().startsWith("a");
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Adnan","ahmet","Mehmet","Kerim","Akin"));
        names.removeIf(startsWithA);

        System.out.println(names);

        System.out.println("================================");

        Predicate<String > startsWithAorC = each -> each.startsWith("A") || each.startsWith("C");

        ArrayList<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList("Adnan","Emre","Mehmet","Kerim","Akin","Celil"));

        names2.removeIf(startsWithAorC);
        System.out.println(names2);

        System.out.println("====================================");


       // Predicate<Character> digits =  d -> d >= 48 && d <= 57; Ascii table

        Predicate<Character> digits = c -> !Character.isDigit(c);

        ArrayList<Character> chars = new ArrayList<>();
              chars.addAll(Arrays.asList('A','B','1','3','4','@','$','Z','5'));
              chars.removeIf(digits);

        System.out.println(chars);


        System.out.println("================================");

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        nums.removeIf(p -> p > 5);
        System.out.println(nums);
















    }
}
