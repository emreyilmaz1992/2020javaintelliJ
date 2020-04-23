package day06_Shorthnd_LogicalOperators;

public class WarmUp01 {
    public static void main(String[] args) {


       /* Warmup task:
        1. A triangle is valid if the sum of all the three angles is equal to 180 degrees. Write a program that declares
         three integers as angles and check whether a triangle is valid or not.
        2. write a java program that accepts three numbers and return the maximum number
        (assume that none of them are equal)
        3. write a java program that accepts three numbers and return the minimum number
        (assume that none of them are equal)
        4. write a java program that accepts three numbers and rteurn the mediam number
                (assume that none of them are equal)
        5. write a java program that can identify if a person is eligible to vote for Donald Trump
        Note : use single if statements  */

       double a = 80;
       double b = 60;
       double c = 40;

       short sumofangles =(short)(a+b+c);
       boolean validtriangle = sumofangles ==180;
       if(validtriangle){
           System.out.println("The shape is triangle");
       }
       if(!validtriangle){
           System.out.println("The shape is not valid triangle");
       }



       if(a > b && a >c){
           System.out.println(a+" is the maximum number");
       }
       if(c>b && c>a){
           System.out.println(c +" is the minumum number");
       }
       if(b>a && b<c || b>c && b<a ){
           System.out.println(b +" is the medium number");

       }


       double d = 100.5;
       double e = 200.5;
       double f = 300.5;

       boolean dGreater = d > e && d > f ;
       boolean eGreater = e > d && e > f ;
       boolean fGreater = f > d && f > e ; // usingf the boolean is not necessary.


       int age = 18;
       boolean citizen = true;
      // if can't use number paremeter so use boolean as true or false.

       boolean eligible = age >=18 && citizen == true;

       if(eligible){
           System.out.println("You are eligible to vote");

       }
















    }
}
