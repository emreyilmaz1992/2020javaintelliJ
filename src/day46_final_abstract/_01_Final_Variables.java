package day46_final_abstract;

public class _01_Final_Variables {
   final int InstanceVariable = 300;
   // final int InstanceVariable2; // final instance variables needs to be initialized immediately

    final static int StaticVariable = 1000;

    public static void main(String[] args) {

        final double PI = 3.14;
        //PI = 3.25; cannot be reassigned

        final String gender = "Male";
       // gender = "female";

        final int score; // we dont have to initialized right away, but we have to before you use it.
      //  System.out.println(score);
        score = 100;
      //  score = 200; we cannot reassign it
        System.out.println(score);
        System.out.println("==============================");

        _01_Final_Variables obj =  new _01_Final_Variables();

      //  obj.InstanceVariable = 400;

        System.out.println(_01_Final_Variables.StaticVariable);
        System.out.println(obj.InstanceVariable);








    }
}
