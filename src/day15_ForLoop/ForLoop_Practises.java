package day15_ForLoop;

public class ForLoop_Practises {
    public static void main(String[] args) {
       //Odd number between 1-100 in a single line separated by a space. 1 ,3 ,5, 7, 9....


       String resultOdd = "";
        for (int number =1 ; number <=100 ; number+=2 ){
           // System.out.print(number+", ");
            resultOdd+= number+", ";

        }
        System.out.println(resultOdd);

        String resultEven="";
        for(int number = 2 ; number <=100; number+=2){
            resultEven+= number+", ";

        }
        System.out.println(resultEven);






    }
}
