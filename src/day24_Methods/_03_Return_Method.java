package day24_Methods;

public class _03_Return_Method {

    public static void maxNum (int a, int b){
        if(a >=b ){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }

    public static void main(String[] args) {

       //  int a = maxNum(10,20); that would give us error since we use public static VOID! .


        int result = addition(10,20);

        System.out.println(result);

        int result2 = result+2000;
        System.out.println(result2);


    }

        public static int addition (int a ,int b){
           // System.out.println(a+b);

            return a+b;
        }


}
