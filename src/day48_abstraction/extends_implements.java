package day48_abstraction;

interface I1{
    void method1(); //1 abstract method

}

interface I2 extends I1{ // since they same type so we use extends rather than implement
    void method2(); // 2 abstract methods

}


abstract class AC implements I2{ // we use implements here, cuz they both different type. One is abstract other is interface
    abstract void method3(); // 3 abstract methods
}


public abstract class extends_implements extends AC { // since abstract inherits abstracts, override becomes optional




    @Override
    public void method2() {

    }

    // 2 abstract method left




}
class testRun extends extends_implements{

    @Override
    public void method1() {

    }

    @Override
    void method3() {

    }
}

