package day45_Exceptions;

import java.util.NoSuchElementException;

public class _03_ThrowKeyword {

    public static void main(String[] args) {


       NoSuchElementException obj = new NoSuchElementException();


      // throw  new NoSuchElementException();

    /*
        boolean breakTime = true;

        if(breakTime){
            throw new RuntimeException("It's break time, we should take break");
        }

     */

    int[] arr = {5,6,7};
        System.out.println(arr[100]);
        System.out.println(9/0);



    }
}
