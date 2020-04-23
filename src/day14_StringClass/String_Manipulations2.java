package day14_StringClass;

public class String_Manipulations2 {
    public static void main(String[] args) {

        String str ="";
        boolean bool1  = str.isEmpty();
        System.out.println(bool1); // true

        String username ="";

        if(username.isEmpty()){
            System.out.println("Please provide the username first.");
        }

        //EQUALS

        String s1 = "Cat";// string literal
        String s2 = new String("Cat");
        System.out.println(s1==s2); //false, different memory locations, different objects

        System.out.println(s1.equals(s2)); // this is true since we use the equal() method.

        String z1 = "Tiger";
        String z2 = new String("Tiger");
        String z3 = "Tiger";

        System.out.println(z1 == z2); // false, different memory locations
        System.out.println(z2 == z3); // false, different memory locations
        System.out.println(z1 == z3); // true, same object

        // equals():

        System.out.println(z1.equals(z2)); // true
        System.out.println(z2.equals(z3)); // true

        String str11 ="Batch 18";
        int Z = str11.trim().length();
        System.out.println(Z);





    }
}
