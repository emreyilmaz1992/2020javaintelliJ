package day24_Methods;

import java.util.Arrays;
import Resources.Library;

public class _07_test {
    public static void main(String[] args) {

        String str = " Cybertek";

        String RevStr = Library.reverseString(str);
        System.out.println(RevStr);


        System.out.println(str.equalsIgnoreCase(RevStr));


        int [] arr = { 1,2,4,6,7,9,0,4,34,23};

        arr = Library.descending(arr);
        System.out.println(Arrays.toString(arr));

        int [] a = {1,2,3,4};
        int [] b = {5,6,7,8};

        int [] c = {};

        c = Library.mergingArrays(a,b);

       // System.out.println(Arrays.toString(c));

        String ksk  ="ABBBBCCCCCD";
        String unique = "";

        unique = Library.uniqueString(ksk);
        System.out.println(unique);

    }
}
