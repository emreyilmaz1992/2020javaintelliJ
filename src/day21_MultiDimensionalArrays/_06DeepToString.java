package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class _06DeepToString {
    public static void main(String[] args) {


        int [] arr1D = {1,2,3};

        int [][] arr2D = { {1,2,3}, {4,5,6} };

        System.out.println(Arrays.toString(arr2D));

        System.out.println(Arrays.deepToString(arr2D));


    }
}
