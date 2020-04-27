package day29_Wrapper_ArrayList;

public class _03_ParseMerthods {
    public static void main(String[] args) {

        String str = "123";

        int a = Integer.parseInt(str); //123


        System.out.println(str + 1); //text
        System.out.println(a+ 1);   //number


        byte b1 = Byte.parseByte(str);
        System.out.println(b1+5);

        Integer I1 =(int)Byte.parseByte(str); //AutoBoxing

        String str2 = "10.5";

        float f1 = Float.parseFloat(str2);
        System.out.println(f1);  //10.5
        double d1 = Double.parseDouble(str2);



        String str3 = "3147483647";

        long num2 = Long.parseLong(str3); // autoboxing
        System.out.println(num2+2);


        String result ="true"; // if it's rather than true or false , outcome always will be false
        boolean c1 = Boolean.parseBoolean(result);
        System.out.println(!c1);


        String result2 = "TRuE"; // parse method has no case sensitivity
        boolean c2 = Boolean.parseBoolean(result2);

        System.out.println(c2); //true








    }
}
