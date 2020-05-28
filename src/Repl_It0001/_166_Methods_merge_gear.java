package Repl_It0001;

public class _166_Methods_merge_gear {

    public static String mergeStrings(String one, String two){

        String result = "";
         int max = Math.max(one.length(),two.length());

        for (int i = 0; i <max ; i++) {

            if(i< one.length()){
                result+= one.charAt(i);
            }
             if(i< two.length()){
                 result+= two.charAt(i);
             }

        }
        return result;



    }
    
    public static void main(String[] args) {

        System.out.println(mergeStrings("abcdefghjjk","1234545345"));




    }
}
