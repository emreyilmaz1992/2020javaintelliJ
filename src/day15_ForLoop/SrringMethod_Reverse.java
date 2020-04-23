package day15_ForLoop;

public class SrringMethod_Reverse {
    public static void main(String[] args) {
        /* 3. write a program that can reverse the following string:
        String str = "Java";
        output: avaJ
        please provide two solutions:
        first solution, you MUST use substring method
        second solution, you MUST use charAt method

        */

        String str =  "Java";

        String reverse1 = ""+ str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);

        //When we concat multiple chars, we get number as a result. In order to fix it we put concat them with empty "" string.

        System.out.println(reverse1);


        String reverse2 = "";
        int lastIndexNum = str.length()-1;
        for(int i = lastIndexNum; i>=0 ; i--){
            System.out.print(str.charAt(i));
            reverse2+= str.charAt(i);
        }





    }
}
