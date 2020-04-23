package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class _04_MultiDimensional_Arrays {
    public static void main(String[] args) {


        int[] arr = {1,2,3};
                        //  0 1 2    0 1 2 3
        int[][] arr2D = {  {1,2,3}, {4,5,6,7} };
                 //           0   ,     1

        System.out.println(arr2D.length); //2

                   int[] arr1D = arr2D[0]; // {1,2,3}

        System.out.println(Arrays.toString(arr1D));
        System.out.println(arr1D.length); //3

        int num1 = arr2D [1][3];
        System.out.println(num1); //7
        //                   0   1      0   1   2
        char [][] ch2D = { {'A','B'}, {'D','E','F'} ,{'G','H','I'} };
        //                     0            1              2

        char ch1  =  ch2D [1][1];
        System.out.println(ch1); // E

        char[]ch2 = ch2D[2]; // {G,H,I};

        System.out.println(Arrays.toString(ch2)); //[G,H,I]










    }
}
