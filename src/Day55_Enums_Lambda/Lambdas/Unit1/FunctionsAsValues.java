package Day55_Enums_Lambda.Lambdas.Unit1;

public class FunctionsAsValues {


    public static void main(String[] args) {
        MyLambda myLambdaFunction = () -> System.out.println("Hello World");
        Addition addFunction = (int a , int b) -> a + b;




    }



    interface MyLambda{
        void foo();
    }
    interface Addition{
        int add(int x , int y);
    }



}


