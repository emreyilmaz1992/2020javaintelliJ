package day30_ArrayList;

import java.util.ArrayList;

public class _06_remove_clear_indexOf {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
                        list.add("A"); //0
                        list.add("B"); //1
                        list.add("C"); //2


            String str = "B";
                    list.remove("B"); // It's an object not int
        System.out.println(list);

                    list.clear();
        System.out.println(list);

        System.out.println("======================");

        ArrayList<Integer> list2 = new ArrayList<>();

                    list2.add(1);
                    list2.add(1);
                    list2.add(2);
                    list2.add(3);

               int num1 =  list2.indexOf(1);
                            // Integer = int    -> autoboxing
        System.out.println(num1); //0

        int num2 = list2.indexOf(100);
        System.out.println(num2); // -1







    }
}
