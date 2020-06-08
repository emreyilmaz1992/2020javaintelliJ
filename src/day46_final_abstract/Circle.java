package day46_final_abstract;

public final class Circle extends Shape{ // we put final here so it means circle never will be super class of any other

    public double radious;
    public final static double PI = 3.14;


    public Circle(double radius){

        this.radious = radius;
    }

    @Override
    public void Area(){

        double area = radious* radious* PI;
        System.out.println("Area of circle :"+area);

    }


}
