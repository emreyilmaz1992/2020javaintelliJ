package day50_Polymorphism;


interface I{
    void method2(); // public abstract
    abstract int method3();
}
interface I2{

}

abstract class A{
    public abstract void method1();
    protected abstract void method4();
}


public class Abstraction extends A implements I,I2 {

    @Override
   public void method1(){

   }

    @Override
    protected void method4() {

    }

    @Override
    public void method2() {

    }

    @Override
    public int method3() {

        return 0;
    }
}
