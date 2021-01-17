package Day55_Enums_Lambda.Lambdas.Unit1;

public class HelloWorldGreeting implements Greeting {

    @Override
    public void perform(){
        System.out.println("Hello World");
    }
//
//    @Override
//    public void trying() {
//        System.out.println("This is how we do it!");
//    }

    public static void main(String[] args) {

        HelloWorldGreeting greet = new HelloWorldGreeting();

        greet.perform();
      //  greet.trying();



    }
}
