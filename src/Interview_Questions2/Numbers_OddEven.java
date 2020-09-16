package Interview_Questions2;

public class Numbers_OddEven {

    //Write  a method which can identifies given number is even or odd
    public static void main(String[] args) {

        System.out.println(identify(4));




    }

    public  static  String identify (int n){

        return n%2 == 0 ? "Even" : "Odd";



    }

}
