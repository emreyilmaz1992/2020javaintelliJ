package Interview_questuons3;

public class Numbers_FactorialNumbers {
    public static void main(String[] args) {

        int a = 5;
        System.out.println(total(a));



    }
    public static int total (int num ){

        int total =1;

        for (int i = 1; i <=num ; i++) {

            total*=i;

        }

        return total;


    }

}
