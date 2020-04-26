package Repl_It0001;

public class _166_Methods_merge_gear {

    public static String mergeStrings(String one, String two){

        String result= "";
        if(one.length() < two.length()) {

            for (int i = 0; i < one.length(); i++) {

                result += "" + one.charAt(i) + two.charAt(i);

            }
            result += two.substring(one.length());
           // return result;
        }else if (one.length()>two.length()){

            for (int i = 0; i < two.length(); i++) {

                result += "" + one.charAt(i) + two.charAt(i);

            }
            result += one.substring(two.length());
           // return result;
        }else if(one.length()== one.length()){

            for (int i = 0; i <one.length() ; i++) {

                result += "" + one.charAt(i) + two.charAt(i);

            }

          //  return result;
        }


        return result;
    }
    
    public static void main(String[] args) {

        System.out.println(mergeStrings("abcdefghjjk","1234545345"));




    }
}
