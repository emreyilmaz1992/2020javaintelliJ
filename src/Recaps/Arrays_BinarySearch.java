package Recaps;

import java.util.*;


public class Arrays_BinarySearch {
    public static void main(String[] args) {


        int[] targetArrrayObject = {11,4,6};
        int targetItemToSearch = 4;

        Arrays.sort(targetArrrayObject); // array has to be sorted before using the binary search

        System.out.println(Arrays.binarySearch(targetArrrayObject,targetItemToSearch));
        // returns the index value of the 4






    }
}
