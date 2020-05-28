package day44_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class _03_TryCatch_Block {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));



        try{
            System.out.println(list.get(10));
        }catch (IndexOutOfBoundsException e){  // you either put this exception or one of the other parent class
            System.out.println("Something went wrong");
        }

        System.out.println("Test completed");



    }
}
