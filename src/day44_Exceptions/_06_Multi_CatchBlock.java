package day44_Exceptions;

import java.util.NoSuchElementException;

public class _06_Multi_CatchBlock {
    public static void main(String[] args) {


        try {
            System.out.println(100 / 0);
        } catch (ClassCastException e) {
            System.out.println("Class Cast");

        } catch (NoSuchElementException e) {
            System.out.println("No such element");
        } catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
         }catch(IndexOutOfBoundsException e){
           System.out.println("Index Out of Bound"); // Parent exception cannot come before parent exception, If we put Runtime before indexBound we get error
       }
       catch (RuntimeException e){
           System.out.println("Runtime");
       }
      // catch (ArithmeticException e){
     //      System.out.println("Arithmetic Exception");
     //  }   we get compile error here cuz runtime is the parent of the Arithmetic exception

        // Arithmetic and runtime can handle the problem, however there will be only one result, so first come first serve principle apply here


    }
}
