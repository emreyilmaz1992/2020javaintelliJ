package day25_MethodsRecaps;
import Resources.Library;
public class _03_Return_Method_Frequency {
    public static void main(String[] args) {

        String str= "ABBBCdefC";

        System.out.println(Library.unique(str));

        System.out.println(Library.removingDupliactes(str));

        String result = "";
        for (int i = 0; i < str.length(); i++) {


            if(!result.contains(""+str.charAt(i))){

                result+= str.charAt(i);
            }



        }
        System.out.println(result);




    }
}
