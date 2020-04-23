package day13_StringClass;

public class String_Manipulations {
    public static void main(String[] args) {

        // charAT
        String str = "Cybertek";
        //            01234567

        char ch1 = str.charAt(5);
        System.out.println(ch1 == 'A'); // false
                       // 't' != 'A'

        System.out.println(ch1 == 'T');
                      //   't' != 'T'

        //LENGTH

        int totalLength = str.length();
        System.out.println(totalLength); //8

        System.out.println(totalLength > 250);//false

        String str2 = "Today is great day, Java is fun";

        int maxIndexNum = str2.length() - 1;
        System.out.println(maxIndexNum); // 30

        // CONCAT

        String s1 = "Cybertek";
             s1 = s1.concat(" School"); // "Cybertek School"

        System.out.println(s1); // s1 = Cybertek School

        String s2 = "Java";
        System.out.println(s2.concat(" is a programming language"));  // Java is a programming language
        System.out.println(s2); // Java

        s2 = s2.concat(" is a programming language");
        System.out.println(s2); // Java is a programming language

        String r1 = "Java is fun";
                r1=    r1.concat(", and it's easy");


        // LOWER CASE

        String name1 = "CYBERTEK";
        name1 = name1.toLowerCase();
        System.out.println(name1);


        //UPPERCASE

        String name2 = "cybertek";
        name2 = name2.toUpperCase();
        System.out.println(name2);

        //TRIM

        String A1 = "      Today is a great day";
          A1=     A1.trim();  // Will delete the empty spaces before Today.
        System.out.println(A1); //Today is a great day


        int tti = "Emre".length();
        System.out.println(tti);

        String validname = ("sdcad").toLowerCase();


















    }

}
