package day36_StaticBlock;

class Tester{ // AM is default
    public static void main(String[] args) {
        System.out.println("Tester Class");
    }

}

class Developer{  // AM is default
    public static void main(String[] args) {
        System.out.println("Developer Class");
    }


}

public class MultiClasses {  // there can only be one public class // access modifier is public
    public static void main(String[] args) {
        System.out.println("Multi class");
    }

}
