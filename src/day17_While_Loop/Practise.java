package day17_While_Loop;

public class Practise {
    public static void main(String[] args) {
        /*
        Wrie a program that calculates sum of the even numbers
         */
        int sum = 0;
        int i = 0;
        while(i <= 10){
            if(i % 2 ==0){
               sum+=i;
            }
            i++;
        }

        System.out.println(sum);




    }
}
