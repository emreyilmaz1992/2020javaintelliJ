package day29_Wrapper_ArrayList;

import java.util.Arrays;

public class _05_WrapperClass_Practise {
    public static void main(String[] args) {
/*
        find the maximum and minimum numbers
        NOTE: Do not use sort method

 */
        String[] arr = {"1","2.5", "3", "3.5", "4.5"};

        double max = Double.MAX_VALUE;

        for (String each : arr){
            double num = Double.parseDouble(each);
            if(num > max){
                max = num;
            }
        }

        System.out.println("============================");

        String[] arr2 = {"1","2.5", "3", "3.5", "4.5"};
        double [] d1 = new double[arr2.length];

        for (int i = 0; i <arr2.length ; i++) {

            d1[i] = Double.parseDouble(arr2[i]);

        }
        System.out.println(Arrays.toString(d1));








    }
}
