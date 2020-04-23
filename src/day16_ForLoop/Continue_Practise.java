package day16_ForLoop;

public class Continue_Practise { //print the alphabet backwards skip Y,H,J,D
    public static void main(String[] args) {


        for ( char ch = 'Z'; ch >= 'A' ; ch--){

            if(ch =='A' || ch == 'Z' || ch =='J' || ch == 'D'){
                continue;
            }
            System.out.print(ch+ " ");


        }
        System.out.println();


        for (int i = 1; i <=100; i++) {
            if(i % 3 == 0 || i % 5 ==0 ){

                continue;
            }

            System.out.print(i+" ");
        }








    }






}
