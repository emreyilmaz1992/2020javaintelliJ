package day51_Recap;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapeObjects {
    public static void main(String[] args) {

        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(5);

        Cylinder cylinder1 = new Cylinder(3,5);
        Cylinder cylinder2 = new Cylinder(3,5);

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.addAll(Arrays.asList(circle1,circle2,cylinder1,cylinder2));

       Shape shape2 = new Cylinder(3,6);

        ((Cylinder)shape2).calculateVolume();

        for(Shape eachShape : shapes){
            System.out.println(eachShape.name+" : "+eachShape.calculateArea());
        }

        System.out.println("==================================================");

        ((Cylinder)shapes.get(2)).calculateVolume();




    }
}
