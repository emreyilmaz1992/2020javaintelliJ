package day17_While_Loop;

public class Branching_Statements {
    public static void main(String[] args) {

        //System.exit(0): stops the entire program immediately.

        for (int i = 0; i <5 ; i++) {
            if(i % 2 != 0){
                System.exit(0);
            }
            System.out.println(i);
        }

        System.out.println("Test completed");







    }
}
