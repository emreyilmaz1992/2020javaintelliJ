package Interview_questuons3;

import java.util.Arrays;

public class Array_SortAscending {

    public static void main(String[] args) {

       int[]arr={2,5,6,8,9,7,1,75};

       sortAscending(arr);


        
        
        
    }
    public static void sortAscending(int[]arr){

        int temp=0;
        boolean result = false;

        while (result==false) {
            result = true;
            for (int i = 0; i < arr.length - 1; i++) {

                if (arr[i] > arr[i + 1]) {

                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    result = false;
                }


            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
