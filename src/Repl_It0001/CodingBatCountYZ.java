package Repl_It0001;

public class CodingBatCountYZ {
    public static void main(String[] args) {


        String str = "y2bz";
        System.out.println(countYZ(str));




    }
    public static int countYZ(String str) {

        str = str.toLowerCase();

        String arr [] = str.split(" ");
        int count = 0;

        for(int i=0; i<arr.length; i++){

            if(arr[i].endsWith("y") || arr[i].endsWith("z")){
                count++;
            }else if(arr[i].endsWith("z") || arr[i].endsWith("y")){
            }
        }
        if(arr.length ==1){
            if((arr[0].charAt(0)=='y' && arr[0].charAt(arr[0].length()-1) == 'z' ) ||(arr[0].charAt(0)=='z' && arr[0].charAt(arr[0].length()-1) == 'y' )){
                count =2;
            }
        }


        return count;





    }



}
