package day36_StaticBlock;

import day34_Custom_Class.Developer;

public class HumanResources {
    //dev1.setInfo("Namik","Developer",1200000,123);
    static Developer dev1 = new Developer();
    static Developer dev2 = new Developer();
    static Developer dev3 = new Developer();
    static Developer dev4 = new Developer();
    static Developer dev5 = new Developer();









    static{

        dev1.setInfo("Namik","Developer",1200000,123);

    }

}
