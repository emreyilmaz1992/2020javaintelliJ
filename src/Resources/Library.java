package Resources;

import java.util.Arrays;

public class Library {
    public static int[] descending(int[] arr) {
        Arrays.sort(arr);
        int desc[] = new int[arr.length];

        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {

            desc[j] = arr[i];
            j++;


        }
        return desc;
    }

    public static String reverseString(String str) {

        String Reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            Reverse += str.charAt(i);


        }
        return Reverse;
        //remove duplicates
        //frequency of the string
        // merge two array and return the 3rd one
    }

    public static int[] mergingArrays(int[] arr, int[] arr2) {
        // abc  cdef
        int[] c = new int[arr.length + arr2.length];

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            c[j] = arr[i];
            j++;

        }
        int l = arr.length;
        for (int k = 0; k < arr2.length; k++) {

            c[l] = arr2[k];
            l++;
        }

        // System.out.println(Arrays.toString(c));
        return c;
    }

    public static String unique(String str) {

        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }

            }
            if (count == 1) {
                unique += str.charAt(i);
            }
        }
        return unique;


    }

    public static String removingDupliactes(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (!result.contains("" + ch)) {
                result += ch;

            }

        }
        return result;


    }

    public static int minimumArray(int arr[]) {
        int minimum = arr[0];



        for (int each : arr) {
            if (each < minimum) {
                minimum = each;
            }
        }
        return minimum;
    }

    public static double minumumArray(double[] arr) {
        double minimum = arr[0];


        for (double each : arr) {
            if (each < minimum) {
                minimum = each;
            }
        }
        return minimum;

    }
    public static void uniqueArray ( int [] arr){

        for (int i = 0; i <arr.length ; i++) {

            int count = 0;
            for (int j = 0; j <arr.length ; j++) {

                if(arr[i] == arr[j]){
                    count++;
                }

            }if(count ==1){
                System.out.println(arr[i]);
            }

        }


    }
    public static void uniqueArray ( double [] arr){

        for(double each2 : arr ) {

            int count = 0;

            for (double each : arr) {

                if (each ==  each2) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(each2);
            }
        }

    }
}
