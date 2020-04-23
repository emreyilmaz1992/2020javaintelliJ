package Repl_It0001;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Arrays;
import java.util.Scanner;

public class _146_Methods_SplitPersonInfo {

    public static void person (String info ){

       // info ="jon,doe,30";

        String[] arr = new String[3];
        arr = info.split(",");
        System.out.println("person name: "+arr[0]+" last name: "+arr[1]+" age: "+arr[2]);
    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;








    }
}
