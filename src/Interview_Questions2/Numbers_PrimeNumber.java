package Interview_Questions2;

import java.util.ArrayList;

public class Numbers_PrimeNumber {
    public static void main(String[] args) {


        System.out.println(primeNumberValidation(11));

        sumOfPrime(100);


    }
    public static boolean primeNumberValidation (int n){

        int count = 0;

        for (int i = 1; i <=n ; i++) {

            if (n % i ==0){
                count++;
            }
        }
        if(count ==2){
            return true;
        }
        return false;
    }

    public static void sumOfPrime(int n ){

        ArrayList<Integer> list = new ArrayList<>();
        int result = 0;


        for( int i = 1; i <=n; i++){
            int count = 0;
            for (int j = 1; j <=n ; j++) {

                if(i % j ==0){
                    count ++;
                }

            }

            if(count ==2){
                list.add(i);
                result+=i;
            }


        }
        System.out.println("Prime numbers from 1 to "+n+": "+list);
        System.out.println("Sum of Prime Numbers :"+result);


    }




}
