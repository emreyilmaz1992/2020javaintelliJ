package Interview_Questions2;

public class String_RemoveDuplicates {

//Ex:  removeDup("AAABBBCCC")  ==> ABC

    public static void main(String[] args) {


        String str ="AAABBBCCC";

        System.out.println(removeDuplicates(str));


    }
    
    public static String removeDuplicates(String str){

        String result = "";

        for (int i = 0; i <str.length() ; i++) {

            if (!result.contains(str.charAt(i)+"")){
                result+=str.charAt(i);



            }

        }

           return result;

        
    }
    
    
    


}
