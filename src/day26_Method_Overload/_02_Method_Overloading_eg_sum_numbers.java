package day26_Method_Overload;

public class _02_Method_Overloading_eg_sum_numbers {
    public static void main(String[] args) {


      int result1 =  sum(1,2);
      int result2 =  sum(1,2,3);
      int result3 =  sum(1,2,3,4);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);





    }
    public static int sum (int a , int b ){
        return a+b;
    }
    public static int sum (int a , int b ,int c ) {
        return a + b + c;
    }
    public static int sum (int a , int b, int c , int d ) {
        return a + b + c;
    }



}
