package day24_Methods;

import java.util.Arrays;

public class _05_Return_Example {
    public static int maxNumber(int[] arr){
        Arrays.sort(arr);

        return arr[arr.length-1];
    }





    public static void main(String[] args) {

        int[] arr = {9,8,6,99,8,333,666};
        int[] arr2 = {34,567,23453,567567,678678,34213,23412};

        int max = maxNumber(arr);
        System.out.println(max);

        int min = minNumber(arr);
        System.out.println(min);

        int[] descending = descending(arr);
        System.out.println(Arrays.toString(descending));

        System.out.println(arr[0]);

        int []descending2 = descending(arr2);

        System.out.println(Arrays.toString(descending2));












    }
    public static int minNumber (int [] arr){
        Arrays.sort(arr);
        return arr [0];
    }

    public static int []descending ( int []arr){
        Arrays.sort(arr);
        int desc[] = new int[arr.length];

        int j = 0;
        for (int i = arr.length-1; i >=0 ; i--) {

            desc[j] = arr[i];
            j++;


        }
        return desc;
    }
}
