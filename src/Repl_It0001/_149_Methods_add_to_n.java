package Repl_It0001;

import java.util.Arrays;
import java.util.Scanner;

public class _149_Methods_add_to_n {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(),n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        add_to_r(arr, n);












    }
    public static void  add_to_r(int []r , int n ) {
        int arr2[] = new int[r.length + 1];


        for (int i = 0; i < arr2.length; i++) {


            if (i < (arr2.length - 1)) {
                arr2[i] = r[i];
            } else {
                arr2[i] = n;
            }


        }
        System.out.println(Arrays.toString(arr2));

    }


}
