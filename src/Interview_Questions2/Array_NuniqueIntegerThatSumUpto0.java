package Interview_Questions2;

import java.util.Arrays;

public class Array_NuniqueIntegerThatSumUpto0 {
    /*
    Write a function:

  that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
  The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
  The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
  For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).
     */
    public static void main(String[] args) {


        sumUpToZero(4);





    }
    public static void  sumUpToZero(int n){

        int [] arr = new int[n];
        int sum = 0;

        for (int i = 0; i <n-1 ; i++) {

            arr[i] = i;
            sum+=i;
                                    // arr[1]= 1 arr[2]= 2
                                    // arr[0]=-1 arr[1]=-2  arr[2]=-3
                                    // sum=0 , 1, 3
        }
        arr[n-1] = -sum;
        System.out.println(Arrays.toString(arr));
    }



}

