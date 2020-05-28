package Interview_Questions;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {


        String str = "AABBBCCDDLJSDFLKSFGBGKJBASLJFYGA;FJBL2313131jegf;awhuf;yewGFIAEWHFILGWELJFGADL";
        System.out.println(RemoveDuplicates(str));





    }

    public static String RemoveDuplicates(String str){
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            if(!result.contains(""+str.charAt(i))){
                result+= str.charAt(i);
            }
        }

        String result2="";

        char[] ch1 = result.toCharArray();
        Arrays.sort(ch1);

        for (int i = 0; i <ch1.length ; i++) {

        result2+= ch1[i];

        }

        return result2;

    }




}
