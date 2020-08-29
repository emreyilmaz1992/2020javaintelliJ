package Interview_Questions2;

public class String_FrequencyOfChars {
    public static void main(String[] args) {

      //  Write a return method that can find the frequency of characters

      //  Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

        String str  = "AAABBCDD";
        String result="";
        String nonDup = "";

        for (int i = 0; i <str.length() ; i++) {
            if(!nonDup.contains(""+str.charAt(i))){
                nonDup+=str.charAt(i);
                //str = nonDup
            }

        }
        System.out.println(nonDup); // find each fucking of them first


        for (int i = 0; i <nonDup.length() ; i++) {
            int count = 0;

            for (int j = 0; j <str.length() ; j++) {

                if(nonDup.charAt(i) == str.charAt(j)){
                    count++;
                }

            }
            result+= nonDup.charAt(i)+""+count+" ";

        }


        System.out.println(result);


        // 1. write a program that can return the unique characters from a string
        //Ex:  "AABCC" ==> "B"

        String abc = "AABCC";

        String result2 = "";

        for (int i = 0; i <abc.length() ; i++) {
            int count2= 0;
            for (int j = 0; j <abc.length() ; j++) {

                if(abc.charAt(i)==abc.charAt(j)){
                    count2++;
                }


            }
            if(count2==1){
                result2+=abc.charAt(i)+""+" ";
            }

        }
        System.out.println(result2);


        System.out.println(frequency(str));


    }


        public static String frequency(String str){

        String result ="";
        String nonDump = "";

            for (int i = 0; i <str.length() ; i++) {

               if(!nonDump.contains(""+str.charAt(i))){
                   nonDump+= str.charAt(i);
               }

            }

            for (int i = 0; i <nonDump.length() ; i++) {

                int count = 0;
                for (int j = 0; j <str.length() ; j++) {
                    if(nonDump.charAt(i)== str.charAt(j)){
                        count++;
                    }


                }

                result+= nonDump.charAt(i)+""+count+" ";

            }



        return result;
        }





}
