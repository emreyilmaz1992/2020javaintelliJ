package Repl_It0001;

import Resources.Library;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.function.Predicate;

public class _00001Empty {


      public static void main(String[] args) {
            String str = "aa11b33";
            String result ="";

            int b =0;

            for(int i=0; i<str.length()-1; i++){

                  if(Character.isDigit(str.charAt(i))){
                        result+= str.charAt(i);
                        if(Character.isLetter(str.charAt(i+1))){
                              continue;
                        }
                  }

                   b = Integer.parseInt(result);


            }


            System.out.println(b);



      }

}





















