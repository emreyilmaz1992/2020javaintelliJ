package aye001;

public class ReplitScanner {
    public static void main(String[] args) {

        String str="trm";
        String result="";
        int count=0;

        for (int z=0;z<=str.length()-1;z++) {
            char ch = str.charAt(z); // t


            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == ch) {
                    count++;

                }
            }if (count == 1) {
                result +=str.charAt(z);
            }
        }System.out.println(result);













    }
}
