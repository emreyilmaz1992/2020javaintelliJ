package day29_Wrapper_ArrayList;
import java.util.ArrayList;
public class _06_ArryList_Intro {
    public static void main(String[] args) {

    //  ArrayList<DataType> listName = new ArrayList<DataType>();


    ArrayList<Integer> scores = new ArrayList<Integer>();  //size is 0 now


        scores.add(10); //Autoboxing ,, size is 1.
        scores.add(20);
        scores.add(30);

        System.out.println(scores);
        System.out.println(scores.get(2)); //30

        Integer a1 =scores.get(2); // none
        int a2 = scores.get(2); // unboxing
        double a3 = scores.get(2); //unboxing

        System.out.println(scores.get(2)== 30); //true










    }
}
