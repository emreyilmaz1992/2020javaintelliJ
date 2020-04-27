package Repl_It0001;

public class _170_Clean {
    public static String clean (String text ,String badWord){
        String result ="";
        String [] arr = text.split(" ");


        for (int i = 0; i <arr.length ; i++) {

            if(!arr[i].equals(badWord)){
                result+= arr[i]+" ";

            }

        }

        return result;
    }





    public static void main(String[] args) {


        System.out.println(clean("he said bla bla bla bla","bla"));


    }
}


