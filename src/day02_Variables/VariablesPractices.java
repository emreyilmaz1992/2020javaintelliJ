package day02_Variables;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class VariablesPractices {
    public static void main(String[] args) {
        /*
        salary, federaltax, statetax ,salary after tax ,loan, ssn
         */

        int salary = 120000;
        double federaltax = 0.18;
        float statetax = 0.065f;
        double sumtaxes = federaltax + statetax;
        double aftertax = salary * (1 - sumtaxes);

        System.out.println(aftertax);
        System.out.println("+++++++++++++++++++++++");

        // area of the circle = r * r *pi

        double r = 5.5;
        double area = r * r * 3.14;
        System.out.println(area);

        double kg = 60;
        double pound = kg * 2.25;
        System.out.println(pound);

        int lira = 1000;
        double liraindouble = lira / 6.15;
        System.out.println(liraindouble);

        double liter = 10000;
        double  galon = liter / 3.7;
        System.out.println(galon);

        //float a = 10L;
        //double b = 10f;





        System.out.print("Hello  ");

        System.out.print(" Batch17");













    }













}
