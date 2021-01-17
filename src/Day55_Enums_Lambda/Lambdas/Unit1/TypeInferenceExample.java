package Day55_Enums_Lambda.Lambdas.Unit1;

public class TypeInferenceExample {

    public static void main(String[] args) {

        StringLengthLambda lengthLambda = s -> s.length(); // when you have 1 var you don't need ()

        System.out.println(lengthLambda.getLength("How many here"));

        //StringLengthLambda lengthLambda = String::length;


        printLambda(s -> s.length());


    }
    public static void printLambda(StringLengthLambda l ){

        System.out.println(l.getLength("Hey"));

    }

}


interface StringLengthLambda{
    int getLength(String s);
}
