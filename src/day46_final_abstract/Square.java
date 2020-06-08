package day46_final_abstract;

public class Square extends Shape{  // in order to have the extend here, we need to override the method



        public double side;

        public Square(double side){

            this.side = side;
       }

        public void Area (){
            double area = side * side;

            System.out.println("Area of square: "+area);

        }






}
