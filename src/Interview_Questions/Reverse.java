package Interview_Questions;

public class Reverse {
    public static void main(String[] args) {

    // Ex: Reverse("ABCD"); ==> DCBA

        String str = "ABCD";

        System.out.println(Reverse(str));






    }
    public static String Reverse(String str){

        String result ="";

        for (int i = str.length()-1; i>=0 ; i--) {

            result+= ""+str.charAt(i);

        }


        return result;
    }

}
