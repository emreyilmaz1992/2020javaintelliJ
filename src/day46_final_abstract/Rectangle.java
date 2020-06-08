package day46_final_abstract;

public class Rectangle extends Shape {


    public double witdh;
    public double length;


    public void Area(){

        double area = witdh * length;
        System.out.println("Area of rectangle: "+area);

    }
    public Rectangle(double witdh, double length){
        this.witdh = witdh;
        this.length = length;
    }


}
