package Repl_It0001;

public class Assessment_6_1_mIxEd {
    public static void main(String[] args) {

        String s = "powerful";
        String result = "";

        for (int i = 0; i <s.length() ; i++) {

            if(i % 2 ==0){
                result+=s.substring(i,i+1).toLowerCase();
            }else {
                result+= s.substring(i,i+1).toUpperCase();
            }

        }
        System.out.println(result);






    }
}
