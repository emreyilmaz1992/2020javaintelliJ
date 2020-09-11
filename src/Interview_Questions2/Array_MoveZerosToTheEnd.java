package Interview_Questions2;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_MoveZerosToTheEnd {

    public static void main(String[] args) {

        int[] arr = {1, 9, 2, 9, 3, 9, 4, 9};

        moveZerosToTheEnd(arr);


    }


    public static void moveZerosToTheEnd(int[] arr) {

        int[] result = new int[arr.length];

        int j = 0;
        for (int i = 0; i <arr.length ; i++) {

            if(arr[i]!=0){
                result[j]=arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
