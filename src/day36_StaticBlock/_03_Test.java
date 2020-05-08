package day36_StaticBlock;



public class _03_Test {





    public static void main(String[] args) {

        System.out.println(_02_StaticBlock.tester1);

        System.out.println(_04_StaticBlock.name); // We get null, cuz we initialized them in the main method not static
        System.out.println(_04_StaticBlock.num);

        System.out.println(_04_StaticBlock.name2); // we get the result here since we did it in the static block
        System.out.println(_04_StaticBlock.num2);


    }
}
