package Interview_Questions;

public class SortLetters_and_Numbers_AlphabeticOrder {
    public static void main(String[] args) {
/*
Input:  "DC501GCCCA098911"

OutPut: "CD015ACCCG011899"
 */

        String str = "DC501GCCCA098911";

        String str2 = "";

        for(int i = 0; i < str.length(); i++) {

            str2 += ""+str.charAt(i);

            if(Character.isAlphabetic(str.charAt(i)) && i < str.length()-1 ) {

                if(Character.isDigit(str.charAt(i+1)) ) {

                    str2 +=",";

                }

            }



            if(Character.isDigit(str.charAt(i)) && i < str.length()-1) {

                if(Character.isAlphabetic(str.charAt(i+1))) {

                    str2 +=",";

                }

            }

        }




    }

}
