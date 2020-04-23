package day23_Methods;
/*4. creata a function that can print the maximum number from any given array
	5. creata a function that can print the minimum number from any given array
	6. create a function that can print out the array in descending order
		[1,2,3] == > [3,2,1]

 */

import java.util.Arrays;
import java.util.Scanner;

public class _05_WarmUp_Max_Min {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Create your int array ");

        int[]numbers =  {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),
                input.nextInt(),input.nextInt()};


        maxNumberOfArray(numbers);
        minNumberOFArray(numbers);
        descending(numbers);













    }

    public static void maxNumberOfArray(int arr[]){



        int max = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] >= max){
                max = arr[i];
            }
        }
        System.out.println("max number is: "+max);


    }

    public static void minNumberOFArray(int [] arr) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];

            }

        }
        System.out.println("min number is: "+min);
    }

        public static void descending(int [] arr){



            Arrays.sort(arr);
            int []carr = new int[arr.length];

            int j = 0;
            for (int i = arr.length-1; i >=0 ; i--) {

                carr[j] = arr[i];

                j++;

            }
            System.out.println(Arrays.toString(carr));




        }















}

