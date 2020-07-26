package day46_final_abstract;


/*
public class _06_Final_Class extends String { // It has the final keyword in the String class

}

 */
 class Data{

  public void dataWritten(int a, String b){

   System.out.println("Data is written");
  }


  int a = 100;
  public Data(int a){

   this.a = a;

  }
  public Data(int a,int b){

  }


}

public final class _06_Final_Class extends Data{

 @Override
 public void dataWritten(int a, String b) {
  super.dataWritten(a, b);
 }

 public _06_Final_Class(int c, int d) {

  super(2);

 }

}

/*
class Data2 extends _06_Final_Class{  final class is here is immutable, final class can never be super class

}


 */

