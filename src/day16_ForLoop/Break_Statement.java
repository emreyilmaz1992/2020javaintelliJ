package day16_ForLoop;

public class Break_Statement {
    public static void main(String[] args) {


        for (int i = 1; i <=5 ; i++) {

            if(i ==3){   // if I place the if statement before the print, it'll get executed 2 times. if I do it after print, it'll be 3times
                break;
            }
            System.out.println("Hello World");


        }
        System.out.println("++++++++++++++++");


        for(char i = 'a'; i <='z'; i++){

            if(i == 'd'){   // if we put the condition before print statement it would exit at'c'. we wouldn't have 'd'.
                break;

            }
            System.out.print(i);
        }









    }
}
