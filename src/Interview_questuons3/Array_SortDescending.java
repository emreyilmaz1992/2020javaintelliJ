package Interview_questuons3;

import java.util.Arrays;

public class  Array_SortDescending {
    public static void main(String[] args) {

        int[]arr = {1,4,2,6,4,8,9,19,29};

        sortDescending(arr);



    }
    public static void sortDescending(int[]arr){

        int temp;
        boolean result = false;


        while (result == false) {
            result=true;
            for (int i = 0; i < arr.length - 1; i++) {

                if (arr[i] < arr[i + 1]) {

                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    result=false;

                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }


}
