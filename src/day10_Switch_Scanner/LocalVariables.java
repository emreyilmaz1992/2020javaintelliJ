package day10_Switch_Scanner;

public class LocalVariables {
    public static void main(String[] args) {

        int a= 0; //local variable

        if(true){
            System.out.println(a);
            int b = 10;

        }

        switch(3){
            case 1:
                int c = 100;
            case 2:
                // sout(c) the local variable c bl=elongs the case block 1
        }


        if(9>10){
            int t = 100;

        }else if (11>10){
            int t =200;
        }else if(12>10);{
            int t = 300;
        }
       // System.out.println(t); we get an error.cuz we can't use the local variable outside of it's block.

    }

}
