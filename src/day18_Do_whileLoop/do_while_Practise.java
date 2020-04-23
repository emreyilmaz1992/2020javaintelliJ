package day18_Do_whileLoop;

public class do_while_Practise {
    public static void main(String[] args) {
        // print all the even numbers between 0 ~ 100

        int number = 0;

        do{
            if(number % 2 != 0)


                System.out.print(number + " ");

            number++;
        }while(number <= 100);
        System.out.println();

        //
        int i = 1;

        do{
            i++;      // if we put the iterator before the statement it's gonna start from 2
            System.out.println(i);


        }while (i<=5);
        System.out.println("=============");



        int z = 1;

        do{

            System.out.println(z);

            if(z ==3){
                break;
            }
            z++;


        }while(z <= 5);


        System.out.println("==========================");

        int y = 1;
        do{


            if(y == 3) {
                y++;       //need to make sure that iterator is not skipping.
                continue;


            }
            System.out.println(y);
            y++;
        }while(y <=5);



        System.out.println("==========================");


        int t = 1;

        do{

            if(t % 2 != 0){
                t++;
                continue;
            }
            System.out.print(t+" ");

            t++;
        }while(t <= 100);



    }
}
