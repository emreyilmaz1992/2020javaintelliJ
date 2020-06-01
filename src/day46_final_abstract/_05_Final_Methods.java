package day46_final_abstract;


class Test{

    protected void method1(){
        System.out.println("A");

    }


}

public class _05_Final_Methods extends Test{

    @Override
    public void method1(){
        System.out.println("B");  // if it was final at the upper method we would not be able override
    }

}
