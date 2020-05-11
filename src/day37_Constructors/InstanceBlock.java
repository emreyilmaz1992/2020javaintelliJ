package day37_Constructors;

public class InstanceBlock {

    static {
        System.out.println("static block");
    }

    {
        System.out.println("Instance block"); // execution always depends on creation of object.Without object it doesn't get executed
    }

    public static void main(String[] args) {

        InstanceBlock obj = new InstanceBlock();

        InstanceBlock obj2 = new InstanceBlock();






    }



}
