package Interview_Questions2;

public class Numbers_FactorialNumber {
    public static void main(String[] args) {

        factorialNumber(5);



    }
    public static void factorialNumber(int n){
        int result=1;

        for (int i = 1; i <=n ; i++) {


            result*=i;


        }
        System.out.println(result);



    }
}
