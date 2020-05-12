package Repl_It0001;

import Resources.Library;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.function.Predicate;

public class _00001Empty {


      public static void main(String[] args) {


            int m = 15;
            int n = 25;

            System.out.println(commonDivisor(m,n));





      }

      public static int commonDivisor(int m, int n){


            int result = 1;
            for (int i = 1; i <= m && i <= n; i++) {
                  if (m % i == 0 && n % i == 0) {
                        result = i;
                  }
            }

            return result;

      }







      }


























