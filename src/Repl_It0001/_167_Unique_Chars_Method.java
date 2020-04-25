package Repl_It0001;

public class _167_Unique_Chars_Method {
    public static void main(String[] args) {


        System.out.println( uniqueChars("BugBusters") ) ;




    }
    public static String uniqueChars(String str){

        String result = "";
        for (int i = 0; i < str.length(); i++) {


            if(!result.contains(""+str.charAt(i))){

                result+= str.charAt(i);
            }


        }
        return result;

    }
}
