package day23_Methods;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class _02_Method_Practise {
    public static void main(String[] args) {
/*step1: Hello Cybertek
step2: Hello World 5 times
step3: Hello Btach 18
step4: Hello World 5 times
step5: Helle Saim
step6: Hello World 5 times



        System.out.println("Hello Cybertek");

        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello Worlds");
        }
        System.out.println("Hello Batch 18");
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello World");

        }
        System.out.println("Hello Saimd");
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello World");

 */
        System.out.println("Hello CyberTek");
        printHello5();
        System.out.println("Hello Batch");
        printHello5();
        System.out.println("Hello saim");
        printHello5();
        System.out.println("===================================");
        evenNumbers();
        System.out.println();
        oddNumber();




        }






    public static void printHello5 (){

        for (int i = 0; i <5 ; i++) {


            System.out.println("Hello Words");
        }

    }
    public static void evenNumbers(){

        for (int i = 1; i <=100 ; i++) {
            if(i % 2 == 0) {
                System.out.print((i)+" ");

            }
        }



    }
    public static void oddNumber(){
        for (int i = 1; i <=100 ; i++) {

            if(i%2 != 0){
                System.out.print(i+" ");
            }

        }
    }



}
