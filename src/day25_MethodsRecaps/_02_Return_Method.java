package day25_MethodsRecaps;

public class _02_Return_Method {

    // a,b

    public static int max(int a  ,int b){
        int max = 0;
        if (a >= b){
            max = a;
        }else {
            max=b;
        }
        return max;
    }

    public static int max2( int a , int b){
        if (a >= b){
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        int max = max(1,5);
        System.out.println(max); //5


        int max2 = max2(59,8);
        System.out.println(max2); //59

    }
}
