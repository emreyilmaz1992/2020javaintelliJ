package Interview_Questions2;

public class String_SumOfDigits {

    public static void main(String[] args) {

    String str = "AB3H56V";

    SumOfDigits(str);



    }
    public static void  SumOfDigits(String str){

        int total = 0;
        String result ="";

       char[]ch = str.toCharArray();

       for (char each : ch){
           if(Character.isDigit(each)){
               total+= Integer.valueOf(""+each);
           }else if(Character.isLetter(each)){
               result+= each;
           }
       }
        System.out.println(result);
        System.out.println(total);


    }


}
