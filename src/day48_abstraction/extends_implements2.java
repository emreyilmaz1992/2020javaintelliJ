package day48_abstraction;

interface P{
    void method1();
}

interface Q extends P {

    int method2();
}

abstract class R{

    abstract void method3();
}




public class extends_implements2 extends R implements Q , P{  // we can use both same time , but extends has to be first written
    public static void main(String[] args) {

      //  R obj = new R();  not concrete




    }
    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    void method3() {

    }
}

