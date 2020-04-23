package day16_ForLoop;

public class WarmUp2 {
    public static void main(String[] args) {
        /*
        3. write a program which prints out the numbers from 1 to 30:
			1. for numbers which are divisible by 3, print "FIN" instead of the number.
			2. for numbers which are divisible by 5, print "RA" instead of the number
			3. for numbers which are a divisible by both 3 and 5, print "FINRA" instead of the number
		Ex:
			1 2 FIN 4 RA FIND .... FINDRA

         */

        for (int i = 1; i <=30 ; i++) {

            if(i % 3 == 0 && i % 5 == 0){
                System.out.print("FINRA"+"-");
            }else if(i % 3 == 0){
                System.out.print("FIN"+"-");
            }else if( i % 5 == 0){
                System.out.print("RA"+"-");
            }else{
                System.out.print(i+"-");
            }


        }



    }
}
