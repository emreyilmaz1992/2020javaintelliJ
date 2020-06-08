package Interview_Questions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Sort_Ascending {
    public static void main(String[] args) {




        int[]arr = {3,5,7,8,2,3};

        System.out.println(Arrays.toString(Ascending(arr)));







    }

        public static int[] Ascending(int[]arr){


            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i <arr.length ; i++) {

                for (int j = 0; j <arr.length ; j++) {


                    if(arr[i] < arr[j]){

                        list.add(arr[i]);
                    }

                }

            }

            for (int i = 0; i <arr.length ; i++) {

                arr[i] = list.get(i);

            }




        return arr;

        }




    }

