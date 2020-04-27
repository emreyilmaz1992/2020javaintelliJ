package Repl_It0001;

public class _186_is_Digit_ExtractNumber {

    public static String extractNum(String s) {


        String result = "";
        for (int i = 0; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i))) {

                result += s.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println(extractNum("a1b4cccc9"));





    }
}
