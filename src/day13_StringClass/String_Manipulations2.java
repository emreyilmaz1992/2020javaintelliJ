package day13_StringClass;

public class String_Manipulations2 {
    public static void main(String[] args) {

        //SUBSTRING

        String str = "Cybertek school is the best";
                  //  012345678
        String schoolName = str.substring(0,8);

        System.out.println(schoolName); //Cybertek

        String fullName = "Kuzzat Altay";
                       //  0123456789..
        int a = 7;

        String firstName = fullName.substring(0,(a-1));
        String lastName = fullName.substring(7,12);

        System.out.println(firstName);
        System.out.println(lastName);

        //full name = firstname lastname
        // gmail    = lastname_firstname@gmail.com

        String Murtaza = "Murtaza Nazeeri";
        String firstname = Murtaza.substring(0,7);
        String lastname = Murtaza.substring(8,15);

        String gmail =(lastname.concat("_").concat(firstname).concat("@gmail.com")).toLowerCase();

        System.out.println(gmail);

        String s1 = "I love Java programming language";
            //       01234567

        String classNme = s1.substring(7);
        System.out.println(classNme); //Java programming language

        //REPLACE

        String s2 = "I like C# Programming"; // if there is moren C# they all will be replaced
               s2= s2.replace("C#", "Java");

        System.out.println(s2); // I like Java programming

        String name = "COVID 18";
               name = name.replace("8","9");
        System.out.println(name); //COVID 19

        //REPLACE FIRST

        String r1 = "I like C# is fun, C# is cool";
               r1 = r1.replaceFirst("C#","Java"); //ONLY replace the first C#
        System.out.println(r1);

        String r2 = "Tomorrow is Monday, Tomorrow is Tuesday";
               r2 = r2.replaceFirst("Tomorrow", "Today") ;
        System.out.println(r2);














    }
}
