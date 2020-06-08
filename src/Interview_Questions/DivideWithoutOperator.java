package Interview_Questions;

public class DivideWithoutOperator {
    public static void main(String[] args) {

        int a = 8292;
        int b = 2;




    }
    public static int Divide(int a, int b){

        int count = 0;
       // int result = 0;

        if(b>a){
            return 0;
        }


       while (a >=b){

           a = a-b;

           count++;


       }



       return count;




    }
}
