package Interview_Questions2;

public class String_Reverse {

    public static void main(String[] args) {

        String str = "APPLE";

        System.out.println(reverseString(str));

        String result = new StringBuffer(str).reverse().toString();

        System.out.println(result);


    }
    public static String reverseString(String str){

        String result ="";

        for (int i = str.length()-1; i>= 0 ; i--) {

            result += str.charAt(i)+"";

        }

        return result;


    }

}
