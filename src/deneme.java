import java.util.ArrayList;
import java.util.Arrays;

public class deneme {

    public static void main(String[] args) {

    int []arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(highestEven(arr));






        }

        public static int highestEven(int []arr){

        Arrays.sort(arr);
        ArrayList<Integer> res = new ArrayList<>();
        int result =0;

            for (int each : arr){

                if(each % 2 ==0){
                    res.add(each);
                }

            }
        return res.get(res.size()-1);
















    }











}
