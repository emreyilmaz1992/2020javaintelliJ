package day38_Constructor;



public class ConstructorCalls3 {

    public ConstructorCalls3(){
        this(9); // int argument
        System.out.println("defaault");
    }

    public ConstructorCalls3(int a){
         //this(); //we get error since we called int a constructor in default constructor already
        System.out.println("Int Argument");
    }

    public  ConstructorCalls3(String str){

        this();
    }

    public static void main(String[] args) {

        ConstructorCalls3 obj1 = new ConstructorCalls3();





    }

}
