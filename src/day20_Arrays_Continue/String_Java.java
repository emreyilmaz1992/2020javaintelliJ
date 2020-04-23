package day20_Arrays_Continue;

import java.util.Arrays;

public class String_Java {
    public static void main(String[] args) {



        String name = "Emre Yilmaz";
        char[]ch= name.toCharArray();

        System.out.println(Arrays.toString(ch));


        String str1 = "Cybertek School";
        String str2 = "School Cybertek";

        char[]ch1 = str1.toCharArray();
        Arrays.sort(ch1);

        char[]ch2 = str1.toCharArray();
        Arrays.sort(ch2);

        System.out.println(ch1);
        System.out.println(ch2);

        boolean result = Arrays.equals(ch1, ch2);
        System.out.println(result);  //true

    }
}
