package Interview_Questions;

import java.util.Arrays;

public class MoveZerosToTheEnd {
    public static void main(String[] args) {
        /*
        input:  {1,0,2,0,3,0,4,0};

        output: [1, 2, 3, 4, 0, 0, 0, 0]
         */

        int[]arr = {1,0,2,0,3,0,4,6,2,0,0};

        System.out.println(Arrays.toString(MovingZeros(arr)));







    }
    public static int[] MovingZeros(int[]arr){

        int j =0;
        int x = arr.length-1;

        int result[] = new int[arr.length];

        for (int i = 0; i <arr.length ; i++) {

            if(arr[i] !=0){
                result[j] = arr[i];
                j++;
            }else if(arr[i] == 0){
                result[x] = arr[i];
                x--;
            }

        }

        return result;



    }



}
