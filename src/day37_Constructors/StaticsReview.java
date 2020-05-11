package day37_Constructors;

public class StaticsReview {

    static int a; // 1 copy
    int b; // 2 , each object has its own copy of instance variable



    public static void main(String[] args) {

    StaticsReview obj1 = new StaticsReview();
    obj1.a = 20;
    obj1.b = 10;


    StaticsReview obj2 = new StaticsReview();
    obj2.a = 30;
    obj2.b = 40;

        System.out.println(obj1.a); // 30
        System.out.println(obj2.a); // 30

        System.out.println(obj1.b); //10
        System.out.println(obj2.b); //40




    }
}