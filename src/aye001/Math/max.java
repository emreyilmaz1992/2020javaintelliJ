package aye001.Math;






public class max {

    /*
    Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.


    blackjack(19, 21) → 21
    blackjack(21, 19) → 21
    blackjack(19, 22) → 19
     */

    int a =19;
    int b=20;


    int c = (a<=21 && b<=21)? Math.max(a,b):(a>21)? 0 :(b>=a)? 0 : 0;










}
