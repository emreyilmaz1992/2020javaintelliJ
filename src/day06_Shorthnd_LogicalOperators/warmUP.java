package day06_Shorthnd_LogicalOperators;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class warmUP {
    public static void main(String[] args) {

/* package name: day06_Shorthnd_LogicalOperators
class name: warmUp
warmup task:
    1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    3. manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;

 */
                double Gallon = 10;
                double GallontoLittes  = Gallon * 3.785;
        System.out.println(Gallon+" gallons is equal to "+ GallontoLittes+ " liters.");


        double Litters = 3785;
        double LittertoGallon = Litters/3.785;
        System.out.println(Litters+" litter is equal to "+ LittertoGallon+" gallon.");

        int x = 300;
        int y = 400;
        int z = x + y - x * y +x / y;
        System.out.println(z);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        int a = 200;
        int b = -a++ + - --a * a-- % 2;
        // b = -200 + -200 * 200 % 2
        // b = -200 + -40000 % 2
        // b = -200 + 0
        // b = -200;













    }
}
