package Repl_It0001;

public class _171_Methods_With_String {
    public static String limit (String text , int maxLength) {


        String result = "";

        result = text.substring(0, maxLength);
        return result;
    }
        public static void main(String[] args) {


        System.out.println(   limit("abcde", 3));










    }

}
