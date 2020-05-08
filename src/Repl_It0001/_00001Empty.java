package Repl_It0001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.function.Predicate;

public class _00001Empty {

      public static void main(String[] args) {

            int[] a = {1, 2, 3, 4, 5};


            for(int each : a){
                  if(each % 2 == 0){
                        each = each /2;
                        System.out.println(each);
                  }else {
                        each = each*10;
                        System.out.println(each);
                  }
            }







      }
















}