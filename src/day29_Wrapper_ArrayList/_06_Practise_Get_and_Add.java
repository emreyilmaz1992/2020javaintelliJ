package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class _06_Practise_Get_and_Add {
    public static void main(String[] args) {

        ArrayList<String > shoppingList = new ArrayList<>();

        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Butter");
        System.out.println(shoppingList);

        for (int i = 0; i <shoppingList.size() ; i++) {

            System.out.print(shoppingList.get(i)+" ");

        }
        System.out.println();
        System.out.println("=========================");

        for(String each : shoppingList){

            System.out.println(each);
        }







    }
}
