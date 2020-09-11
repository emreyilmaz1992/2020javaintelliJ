package Interview_Questions2;

import java.util.Arrays;

public class Array_SortDescenidng {

    public static void main(String[] args) {


        int[] arr = {5,6,7,8,9,10};
        int temp;

        boolean result = false;

        while( result = false) {
            result = true;
            for (int i = 0; i < arr.length - 1; i++) {

                if (arr[i] < arr[i + 1]) {

                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                result= false;
                }
            }
        }
        System.out.println(Arrays.toString(arr));



    }




}
