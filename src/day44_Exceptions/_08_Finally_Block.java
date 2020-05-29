package day44_Exceptions;

public class _08_Finally_Block {
    public static void main(String[] args) {

        try {
            System.out.println(9 / 0);
        }catch (Exception e){
            System.out.println("Catch Block");
        }finally {
            System.out.println("Finally"); // this line will be executed no matter what even the error code is false
        }



    }
}
