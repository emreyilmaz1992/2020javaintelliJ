package day42_Inheritance;


class test{

    public test(){
        System.out.println("A");
    }


}
public class Constructor  extends  test{

    public Constructor(){
        System.out.println("B");
    }

    public static void main(String[] args) {

        //test obj2 = new test(); A

        Constructor obj = new Constructor(); //  A B          we called the constructor , not inherited

    }

}
