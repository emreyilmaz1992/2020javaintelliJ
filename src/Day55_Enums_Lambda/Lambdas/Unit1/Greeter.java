package Day55_Enums_Lambda.Lambdas.Unit1;

public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();
    }

//    public void tryna(Greeting greeting){
//        greeting.trying();
//    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldGreeting hello = new HelloWorldGreeting();

        greeter.greet(hello);
        //greeter.tryna(hello);

        MyLambda myLambdaFunction = () -> System.out.println("Lambda test");
        Greeting lambdaGreeting = () -> System.out.println("Hello World");
        // cuz interface greeting have the same signature and only one. We may add the second
        // don't get confused if you check this later


        Addition addFunction = (int a , int b) -> a + b;




        lambdaGreeting.perform();
        // This is how you execute lambda expressions. By calling the interface method on it, just
        // just as if it were an instance of a class!

        myLambdaFunction.foo();

        System.out.println(addFunction.add(2, 6));


        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Inner Class");
            }
        };
        // this is known as anonymous inner class



    }

    interface MyLambda{
        void foo();
    }
    interface Addition{
        int add(int x , int y);
    }



}
