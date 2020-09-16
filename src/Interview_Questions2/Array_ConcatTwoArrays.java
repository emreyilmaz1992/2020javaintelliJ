package Interview_Questions2;

import java.util.Arrays;

public class Array_ConcatTwoArrays {

    public static void main(String[] args) {

        int[]a = {1,2,3,4};
        int[]b = {5,6,7,8};

       result(a,b);






    }
    public static void result (int[]a,int[]b){

        int[]arr = new int[a.length+b.length];

        int i = 0;

        for(int each : a){

            arr[i] = each;
            i++;
        }

        for(int each : b){

            arr[i] = each;
            i++;


        }

        System.out.println(Arrays.toString(arr));
    }





}
