package day13_StringClass;

public class String_Manipulation3 {
    public static void main(String[] args) {

        String str = "I like Java programming John";
        int num1 =str.indexOf("J");
        int num2 = str.indexOf("John");

        System.out.println(num1); // 7
        System.out.println(num2); //24 index of the first character (J) of John

        String str2 = "Cybertek school is awesome";

        int firstS = str2.indexOf("s"); //9
        System.out.println(firstS); //
        System.out.println("++++++++++++++++++++++++++");

        int secondS =str2.indexOf("is")+1; // it gives us the first character which is "i" in order to find to s we add 1
        System.out.println(secondS); //17

        int maxIndexnumber = "Cybertek".length()-1; //7
        System.out.println("max index number for Cybertek is: "+maxIndexnumber);

        String names = "Muhtar";
            int a1 =   names.indexOf("Good guy");
        System.out.println(a1); //-1 means it doesn't exist

        String fullname = "Kuzzat Altay";
        String firstName = fullname.substring(0, fullname.indexOf(" ") );
        String lastName = fullname.substring(fullname.indexOf(" ")+1 );

        System.out.println(firstName);
        System.out.println(lastName);


        //LAST INDEXOF






    }
}
