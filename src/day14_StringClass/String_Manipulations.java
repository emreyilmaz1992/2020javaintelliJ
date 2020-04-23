package day14_StringClass;

public class String_Manipulations {
    public static void main(String[] args) {

        //INDEX OF

        String str = "I like to J learn Java. I like to watch the movie Jumanji";
        int a1 = str.indexOf("J");

        System.out.println(a1); //10 index number starts from 0.returns the 1st matching one.

       int a2 =  str.indexOf("Jum");
        System.out.println(a2); // 50. thats for the J in Jumanji

       int a3 = str.indexOf("a. I")+3; //to find I
        System.out.println(a3); //24

        //lastIndexOf()

        String str2 = "I like Java, and I like reading";

        int b1 =     str2.lastIndexOf("I");
        System.out.println(b1) ; //17

        int b2 = str2.lastIndexOf("l");
        System.out.println(b2); //19

        String z = "I like the C#, C# is cool ";

        int c1 = z.lastIndexOf("C");
        System.out.println(c1); //15

        String x = "I like Java, Java is fun, Java programming is fun"; //find the second J
        int x1 = x.indexOf(", Ja")+2;
        System.out.println(x1); //13

        char ch1 =  x.charAt(13);
        System.out.println(ch1); // J


    }

}
