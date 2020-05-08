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
        num = 100;
        tester1 = new Tester();
        tester1.setTesterInfo("emre",123,"tester",122324);
    }




    public static void main(String[] args) {

        name = "Muhtar"; // if we assign them in the main method when we use the outside the method we don't get the result
        num = 200;    // check _03_test class


        System.out.println(name);
        System.out.println(num);





    }
}
