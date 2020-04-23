package day18_Do_whileLoop;

public class WarmUp_Unique {
    public static void main(String[] args) {

/*
        1. write a program that can return the unique characters from a string
        Ex:  "AABCC" ==> "B"

 */




        String str = "AZBAZBCCDERTYQAY";

        String result = ""; //"B"


        for(int  i = 0; i <= str.length()-1; i++ ){
            int count = 0;

            for(int j=0; j <= str.length()-1; j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count == 1){  // if unique
                result+= str.charAt(i);
            }

        }

        System.out.println(result);




    }
}
