package Interview_Questions;

public class SumOfDigits_In_a_String {
    public static void main(String[] args) {

    // ASD2F4DA1 = 7

        String str = "ASD2F4DA1 ";
        System.out.println(SumOfDigitsInString(str));






    }


    public static int SumOfDigitsInString(String str){

        int result = 0;
        char ch1[] = str.toCharArray();




        for (int i = 0; i <str.length() ; i++) {


            if(Character.isDigit(ch1[i])){
                result+= Integer.valueOf(""+ch1[i]);
            }

        }

        return result;




    }


}
