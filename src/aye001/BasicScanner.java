package aye001;

import java.util.*;

public class BasicScanner {


    public static void main(String[] args) {

       ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,3,4,5,6));

       Set<Integer> noDuplicates = new LinkedHashSet<>();
       noDuplicates.addAll(list);

       if(noDuplicates.size()== list.size()){
           System.out.println("No duplicates");
       }else{
           System.out.println("Yes duplicates");
       }


       int [] arr = {1,2,3,4};

        System.out.println(arr[6]);



    }





}
