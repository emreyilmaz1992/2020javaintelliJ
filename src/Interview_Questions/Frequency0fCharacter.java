package Interview_Questions;

import javax.jws.soap.SOAPBinding;

public class Frequency0fCharacter {
    public static void main(String[] args) {
        // Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

        String str = "AAABBCDD";
        String result = "";


        for (int i = 0; i <str.length() ; i++) {

            int count = 0;
            for (int j = 0; j <str.length() ; j++) {

                if(str.charAt(i) == str.charAt(j)){
                    count++;

                }




            }
            result+= ""+str.charAt(i)+count+"";
            str = str.replace(""+str.charAt(i),"");
        }
        System.out.println(result);











    }
}
