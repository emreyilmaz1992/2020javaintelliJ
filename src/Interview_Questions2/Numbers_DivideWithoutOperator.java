package Interview_Questions2;

public class Numbers_DivideWithoutOperator {
    public static void main(String[] args) {

        dividingWithoutOperator(100,2);




    }
    public static void dividingWithoutOperator(int n,int m ){


        if(m ==0){
            System.out.println("Invalid Number");
        }

        int count = 0;

        while(n>=m){

            n-=m;
            count++;

        }
        System.out.println(count);



    }
}
