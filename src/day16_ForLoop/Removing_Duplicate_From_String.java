package day16_ForLoop;

public class Removing_Duplicate_From_String {
    public static void main(String[] args) {


        String str = "ababbcbhdhhdhdhdhjfjjfjaosoodpqwojdpewjfpjewfpjowj"; //abchdjfospqwe
                   // 0123
        String result ="";   //ab

        for (int i = 0; i <=str.length()-1 ; i++) { //if the string result does not contains str.charAt(i),then we concat
           /* if(!result.contains(""+str.charAt(i))) {

                result += str.charAt(i);
            }

            */
           if(result.contains(""+str.charAt(i)))
               continue;

            result += str.charAt(i); // only gets executed if this char not contained in the result


        }
        System.out.println(result);

    }
}
