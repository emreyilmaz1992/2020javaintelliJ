package day36_StaticBlock;

import day34_Custom_Class.Tester;

public class StaticBlock4 {

    static String name;
    static String name2 = "emre";

    int insVariable;

    static Tester tester1 = new Tester();
   // tester1.setTesterInfo("Muhtar",234,"SDET",12000) we get error. cuz Initialization takes more than 1 step.so we put the rest in the block



    static { // gets executed as soon as the class is loaded
             // designed to initialized static variables

        name ="CyberteK School";
        tester1.setTesterInfo("Muhtar",234,"SDET",12000);

       // insVariable = 300; static only accepts static

        StaticBlock4 obj1 = new StaticBlock4();
        obj1.insVariable = 300; // we have create a object of the class but do not use it


    }

    public static void main(String[] args) {

        System.out.println(name);
        System.out.println(name2); // value that assigned in the static block gets executed first.

        StaticBlock4 obj2 = new StaticBlock4();
        System.out.println(obj2.insVariable); // 0







    }



}
