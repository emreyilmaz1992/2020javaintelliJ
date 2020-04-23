package day25_MethodsRecaps;

public class _05_WarmUp_Unique {
    /*2. use the above method to create another called uniques that accepts a string paramter and returns it's unique characters as String
			Ex: uniques("ABBC"); 		==> "AC"
				uniques("Cybertek");  	==> "cybrtk"

     */
    public static void main(String[] args) {
        String str= "ABB";





        String result = "";
        for (int i = 0; i <str.length() ; i++) {
            int num = frequency(str, str.charAt(i));
            if (num == 1) {
                result += str.charAt(i);
            }
        }

    }
    public static String uniques (String str){
        String result = "";
        for (int i = 0; i <str.length() ; i++) {
            int num = frequency(str, str.charAt(i));
            if (num == 1) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static int frequency (String str , char ch){
        // String str = "AAA";
        // char ch = 'A';

        char [] arr = str.toCharArray();
        int count = 0 ;
        for (char each : arr){
            if(each ==ch ){
                count++;
            }
        }
        return count;
    }
}

