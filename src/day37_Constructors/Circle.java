package day37_Constructors;
/*
 Create a class called Circle
            instance variables:
                    radius, pi, diameter
            add a constructor that can initialize the radius of the circle
            instance methods:
                    area(): can return the area of the circle as double
                    perimeter(): cna return the perimeter of the circle as double
                    toString(): returns the info of the circle
            Note: global value of PI is 3.14
                  diameter of circle = 2 * radius
                  area of circle = PI * r * r
 */

import java.text.DecimalFormat;

public class Circle {

    static double PI = 3.14;
    double radius;
    double diameter;

    public Circle(double radius) {
        this.radius = radius;
        diameter = radius * 2;
    }

    public double area() {
        return PI * radius * radius;
    }

    public double perimeter() {
        return diameter * PI;
    }

    public String toString() {

        return "Circle radius: " + radius +
                ", Circle diameter " + diameter +
                ", Circle area " + area() +
                ", Circle perimeter " + perimeter();


    }
}
    class CircleObjest{

        public static void main(String[] args) {

            DecimalFormat df = new DecimalFormat("0.000");

            double r =3;
            Circle circle1 = new Circle(r);

            double areaOfcircle = circle1.area();

            System.out.println(df.format(areaOfcircle));




        }



    }



