package day46_final_abstract;

public class _07_Practise {
    final int a = 10;
    final static int b = 20 ;


    {
        System.out.println(a);
    }
    static {
        System.out.println(b);
      //  b= 30;  we can't since its final
    }

    final void method1(){ // we can place the final before the public

    }

    public final static void method2(){

    }

    class Test extends _07_Practise{




    }


}
