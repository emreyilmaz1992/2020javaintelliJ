package day36_StaticBlock;

import day34_Custom_Class.Tester;

public class _04_StaticBlock {

    static String name;
    static int num;

    static String name2;
    static int num2;


    static Tester tester1; // if initiliazing takes more than 1 step do the rest after 1 in the static block


    static {
        name2 = "emre";
        num2 = 100;
        tester1 = new Tester();
        tester1.setTesterInfo("emre",123,"tester",122324);
    }




    public static void main(String[] args) {

        name = "Muhtar"; // if you wanna use them outside the class assign them in static block. If you assign them in main method,
                        // you can only use them in this class. In other class result will be null and 0
        num = 200;    // check _03_test class


        System.out.println(name);
        System.out.println(num);





    }
}
