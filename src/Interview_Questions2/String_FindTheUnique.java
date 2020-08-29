package Interview_Questions2;

public class String_FindTheUnique {

    //Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";

        System.out.println(findTheUnique(str));





    }
    public static String findTheUnique(String str){

        String result = "";

        for (int i = 0; i <str.length() ; i++) {
            int count =0;
            for (int j = 0; j <str.length() ; j++) {

                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }

                }
            if(count==1){
                result+= str.charAt(i);

            }

        }

        return result;

    }

}
