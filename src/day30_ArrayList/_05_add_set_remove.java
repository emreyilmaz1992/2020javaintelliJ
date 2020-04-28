package day30_ArrayList;

import java.util.ArrayList;

public class _05_add_set_remove {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(5);
        list1.add(7);
        list1.add(8);

        list1.add(1,6);
      //  list1.add(7,10); compile error

        list1.set(3,9);
        System.out.println(list1);

        System.out.println("========================");

        ArrayList<Integer> list3 = new ArrayList<>();

        list3.add(1); //0
        list3.add(2); //1
        list3.add(3); //2
        list3.add(4); //3

        int a =1;

        list3.remove(1); // {1,3,4} by default 1'll be taken as int

        Integer ab = 1;
        list3.remove(ab);

        System.out.println(list3);
        System.out.println("===================================");
        ArrayList<Integer> list4 = new ArrayList<>();

                list4.add(10);
                list4.add(20);
                list4.add(30);

              //  list4.remove(20); // it's not exist.cuz it's taken as an int not Integer

                Integer a2 = 20;
                boolean r1 = list4.remove(a2);
        System.out.println(r1);



















    }
}
