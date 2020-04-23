package day20_Arrays_Continue;

public class WarmUps {
    public static void main(String[] args) {


        int arr[]= {2,3,4,5,6,7,8,9};

        int lastindex = arr.length-1;

        int max = arr[0];



        for (int i = 0; i <=lastindex ; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println(max);

        int min = arr[0];

        for (int i = 0; i <=lastindex ; i++) {

            if(arr[i]<min){
                min = arr[i];
            }

        }
        System.out.println(min);






    }
}
