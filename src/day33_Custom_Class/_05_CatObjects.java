package day33_Custom_Class;

import java.util.ArrayList;
import java.util.Arrays;

public class _05_CatObjects {


    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.setCatInfo("Scottish Fold","Gray",2,"Shorty");

      //  System.out.println(cat1);

        Cat cat2 = new Cat();
        cat2.setCatInfo("Stray Cat","Brown Colloration",8,"Morty");

        Cat cat3 = new Cat();
        cat3.setCatInfo("British","White",70,"Rick");

        ArrayList<Cat> catList = new ArrayList<>();
        catList.addAll(Arrays.asList(cat1,cat2,cat3));


        for (int i = 0; i <catList.size() ; i++) {
            System.out.println( catList.get(i));


        }
        System.out.println("=============================");

        cat1.sleep();
        cat2.sleep();
        cat3.sleep();

        System.out.println("=============================");

        cat1.eat("Salmon");
        cat2.eat("Everything");
        cat3.eat("Kebab");









    }
}
