package day36_StaticBlock;

import day34_Custom_Class.Tester;

public class _02_StaticBlock {

    static int a;
    static int b;
    int c;
    /*
    if(100 > 200){
        a = 100;
    }else{
        b= 200;
    }
     */

    static Tester tester1 = new Tester();

    public static void main(String[] args) {





    }
    static{
        a =100;
        b= 200;
        // c = 300; // static only accepts static
        if(100 > 200){
            a = 100;
        }else{
            b= 200;
        }
            tester1.setTesterInfo("Jean", 123, "SDET", 120000);
            // if we had put this in the main method this won't be executed properly in the _03+Test class. because we did it in the static block
        }
    }


