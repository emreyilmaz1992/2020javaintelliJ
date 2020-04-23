package day18_Do_whileLoop;

public class do_while_loop2_iterator {
    public static void main(String[] args) {

        int number = 103; //

        while (number >=100){
            System.out.println(number);
            number--;
        }

        System.out.println("============================"); // if they both have the same condition which is true they'll have the same
                                                            // execution flow

        int number2 =103;
        do{
            System.out.println(number2);
            number2--;
        }while (number2>=100);





    }
}
