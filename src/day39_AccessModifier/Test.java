package day39_AccessModifier;

public class Test {

    public static void main(String[] args) {

        AccessModifiers obj1 = new AccessModifiers();

        System.out.println(obj1.defaultAccess); // since in the same package , we're able to access

        System.out.println(obj1.publicAccess); // anywhere , we're able to access

       // System.out.println(obj1.SSN); since ssn has private access modifier, we can only reach it in the same class, not even same package






    }
}
