package day07_IfStatements;

public class WarmUP {
    public static void main(String[] args) {
        /*write a program that can check the equality of the three given numberrs
        declare 3 numbers n1, n2, n3
        if n1 and n2 are equal  => n1&n2 are equal
        if n2 and n3 are equal ==> n2&n3 are equal
        if n3 and n1 are qual ==>n3&n1 are equal
        if all equal ==> all equal
        if none of them are euqal ==> none of them are equal */




        double n1 = 70;
        double n2 = 60;
        double n3 = 60.8;

        if(n1==n2 && n1 != n3){
            System.out.println("n1 & n2 are equal");

        }else if(n2 == n3 && n2 != n1){

            System.out.println("n2 & n3 are equal");

        }else if(n3 == n1 && n3 != n2){

            System.out.println("n3 & n1 are equal");

        }else if(n1==n2 && n1==n3 && n2== n3){

            System.out.println("All equal");

        }else{
            System.out.println("None equal");
        }

      /*  2.. write a program that can find the number of days in a month
        (Assume that Feb has 28 days) */







    }
}
