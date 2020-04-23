package day17_While_Loop;

public class Palindrome_Test {
    public static void main(String[] args) {


        String str = "Java";


        String reverse = "";

        int lastIndex = str.length()-1;


        while (lastIndex <= 0){
            reverse+=str.charAt(lastIndex);

            lastIndex--;
        }




    }
}
