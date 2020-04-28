package Repl_It0001;

import java.util.Arrays;
import java.util.Scanner;

public class _00001Empty {

    public static String[] reverse(String[] arr) {
        int j = 0;
        String[] arr2 = new String[arr.length];

        for (int i = 0; i <arr.length ; i++) {

            arr2[i] = arr[i];

        }
        for (int i = arr2.length-1; i >=0 ; i--) {

            arr[j] = arr2[i];
            j++;

        }


        return arr;
    }

    public static void main(String[] args) {

                        //   0        1      2
            String [] arr = {"apple", "pear","banana"};

                System.out.println(Arrays.toString(reverse(arr)));







   }
}
