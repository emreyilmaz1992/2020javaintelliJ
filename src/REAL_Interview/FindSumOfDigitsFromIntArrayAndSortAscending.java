package REAL_Interview;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class FindSumOfDigitsFromIntArrayAndSortAscending {
    public static void main(String[] args) {

        int []arr = {4,3,1,2};

        arrays(arr);
        manualSort(arr);




    }
    public static void arrays(int [] arr){

        int result = 0;
        for(int each : arr){

            result+= each;
        }

        Arrays.sort(arr);

        System.out.println(result);
        System.out.println(Arrays.toString(arr));






    }

    public static void manualSort(int [] arr){

        int temp;
        boolean done = false;

        while (done == false) {
            done = true;
            for (int i = 0; i < arr.length - 1; i++) {


                if (arr[i] > arr[i + 1]) {

                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    done = false;

                }




            }
        }

        System.out.println(Arrays.toString(arr));


    }





}
