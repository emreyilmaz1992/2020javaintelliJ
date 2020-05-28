package Interview_Questions;

import Resources.Library;

public class FindTheUnique {
    public static void main(String[] args) {

        String str = "ABBBCCCDEF" ;

        System.out.println(FindTheUnique(str));







    }
    public static String FindTheUnique(String str){

        String result = "";


        for (int i = 0; i <str.length() ; i++) {

            int count = 0;
            for (int j = 0; j <str.length() ; j++) {

                if(str.charAt(i) == str.charAt(j)){
                    count ++;
                }

            }

            if(count <=1){
                result+= ""+str.charAt(i);
            }

        }


        return result;

    }
}
