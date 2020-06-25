package day51_Recap;

public class Cylinder extends Shape implements Volume,PI {
// So far 5


    public double radius;
    public double height;

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
        name = "Cylinder";
    }

    @Override
    public double calculateArea() {
        return (2*PI*radius*height)+(PI*radius*radius);
    }

    @Override
    public double calculatePerimeter() {
        return 2*(PI*2*radius+height);
    }

    @Override
    public double calculateVolume() {
        return  PI *radius*radius*height;
    }
}



