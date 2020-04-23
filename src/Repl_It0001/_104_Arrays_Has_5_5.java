package Repl_It0001;

import java.util.Scanner;

public class _104_Arrays_Has_5_5 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};


//        int i = 0;
//
//        while(i< nums.length){
//
//            if(i == 0){
//                if( (nums[i]==5 && nums[i+1]==5)|| (nums[i+1]==5 && nums[i+2]==5 )|| (nums[i+2] ==5 && nums[i+3] ==5)  || (nums[i+3]==5 && nums[i+4]==5)){
//                    System.out.println("true");
//                    break;
//                }else{
//                    System.out.println("false");
//                    break;
//                }
//            }
//            if(i == 1){
//                if( (nums[i]==5 &&  nums[i+1]==5)|| (nums[i+1] ==5 && nums[i+2]==5) || (nums[i+2] == 5 &&nums[i+3] ==5) ){
//                    System.out.println("true");
//                    break;
//                }else{
//                    System.out.println("false");
//                    break;
//                }
//            }
//            if(i == 2){
//                if( (nums[i]== 5 && nums[i+1] ==5) || (nums[i+1] ==5 && nums[i+2]==5)   ){
//                    System.out.println("true");
//                    break;
//
//                }else{
//                    System.out.println("false");
//                    break;
//                }
//            }
//            if(i == 3){
//                if( nums[i]== 5 && nums[i+1] ==5  ){
//                    System.out.println("true");
//                }else{
//                    System.out.println("false");
//                    break;
//                }
//            }
//
//
//            i++;
//        }
//

        String result="";
        for (int i=0;i<=nums.length-1;i++){
            result+=""+nums[i];
        }
        boolean b1=true;
        boolean b2=false;
        if (result.contains("55")){
            System.out.println(b1);
        }else{
            System.out.println(b2);
        }



    }
}
