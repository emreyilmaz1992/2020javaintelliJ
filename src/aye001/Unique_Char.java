package aye001;

public class Unique_Char {
    public static void main(String[] args) {

        /*
         String str = "AABBCDD";

        String result = ""; //"B"


        for(int  j = 0; j <= str.length()-1; j++ ){
            int count = 0;

            for(int i=0; i <= str.length()-1; i++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count == 1){  // if unique
                result+= str.charAt(j);
            }
          }
        System.out.println(result);
  */
        String str = "AABBCSJJFKFOASJIFJOEIJFPOEJOFQEJOQCDD";
        String result="";



        for (int i = 0; i <str.length() ; i++) {
            int count =0;


            for (int j = 0; j <str.length() ; j++) {

                if(str.charAt(i)==str.charAt(j)) {
                    count++;
                }
            }

            if(count == 1){
                result+=str.charAt(i);
            }

        }
        System.out.println(result);









    }
}
