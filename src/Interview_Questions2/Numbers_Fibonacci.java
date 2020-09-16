package Interview_Questions2;

import java.util.ArrayList;

public class  Numbers_Fibonacci {
    public static void main(String[] args) {

        fibonacciNumbers(13);


    }
    public static void fibonacciNumbers(int n){
        //1,2,3,5,8,13,21
        ArrayList<Integer> list = new ArrayList<>();

       int result = 0;
       int j =0;
       int z =1;

        for(int i =0; i<=n; i++){

            list.add(z);
            result=j+z;
            j = z;
            z=result;

        }
        System.out.println(list);
        System.out.println(result);
        System.out.println(list.get(n));


    }
}
