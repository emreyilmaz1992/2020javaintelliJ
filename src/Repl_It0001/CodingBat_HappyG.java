package Repl_It0001;

public class CodingBat_HappyG {
    public static void main(String[] args) {


        String str  = "xxgggxyg";

        System.out.println(gHappy(str));








    }
    public static boolean gHappy(String str){
        for (int i = 1; i <str.length()-1 ; i++) {


            if(str.charAt(i)=='g' && (str.charAt(i-1) != 'g' && (str.charAt(i+1) != 'g'))){
                return false;
            }
        }
        if(str.equals("g")){
            return false;
        }
        if(str.endsWith("g") && str.charAt(str.length()-2) != 'g'){
            return false;
        }
        return true;
    }

}
