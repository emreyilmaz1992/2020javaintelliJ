package day26_Method_Overload;

import java.util.Arrays;

public class _03_WarmUp_Minumum_Array {
    public static void main(String[] args) {
        /*Warmup task:
		1. write a return method that can return the minimum number from an int array
		2. write a return method that can return the minimum number from a double array
					NOTE: apply method overloading,  DO NOT USE SORT METHOD.
		3. write a method that can print out the unique elements from an int array
					Ex: {1,1,2,3,3} ==> 2
						{6,6,7,7,8,9} ==> 8 9
		4. write a method that can print out the unique elements from a double array
					Note: Apply method overloading

         */


        int arr [] = {5,4,7,5};

        int minimum = arr[0];


        for (int each : arr){
            if(each < minimum){
                minimum = each;
            }
        }
        //System.out.println(minimum);

       int min =  minimumArray(arr);
        System.out.println(min);





    }

    public static int minimumArray(int arr[]){
        int minimum = arr[0];


        for (int each : arr){
            if(each < minimum){
                minimum = each;
            }
        }
        return minimum;
    }

    public static double minumumArray (double [] arr){
        double minimum = arr[0];


        for (double each : arr){
            if(each < minimum){
                minimum = each;
            }
        }
        return minimum;


    }

}
