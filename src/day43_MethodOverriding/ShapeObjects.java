package day43_MethodOverriding;

public class ShapeObjects {
    public static void main(String[] args) {

        Circle circle1 = new Circle(3);

        circle1.calculateArea(); //bug
        circle1.calculatePerimeter(); //bug

        System.out.println("================================");

        Rectangle rectangle1 = new Rectangle(4,2);
        System.out.println(rectangle1.length);
        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();

        System.out.println("================================");

        Square square1 = new Square(4);
        square1.calculateArea();
        square1.calculatePerimeter();



    }
}
