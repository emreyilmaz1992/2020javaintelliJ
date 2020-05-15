package Resources;

import day40_Encapsulation.Encapsulation_01;

public class Encapsulations_Test {

    public static void main(String[] args) {

        Encapsulation_01 obj = new Encapsulation_01();

       // Encapsulations_Test obj2 = new Encapsulations_Test();

       // obj2.SSN = 100; ain't work

        obj.setSSN(12345);

        System.out.println(obj.getSSN());





    }
}
