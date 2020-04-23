package day19_Arrays;

public class Arrays_Practise1 {
    public static void main(String[] args) {


        String classMates[]={"Muro", "Memo", "Iso","Kelo","Emo"};

        System.out.println(classMates[3]); // kelo




        String s1 = classMates[2];

        System.out.println(s1); // Iso

        System.out.println("==========================");


        for (int i = 0; i <=4 ; i++) {

          String name =  classMates[i];
            System.out.print(name+" ");

        }
        System.out.println();

        String [] emails = {"cybertek@yahoo.com", "cybertek@gmail.com",
                "cybertek@homail.com", "cybertek@outlook.com"};


        // print out the account s that registered with the gmail accounts

        for (int i = 0; i <=3 ; i++) {
           String email = emails[i];
           if(email.endsWith("@gmail.com")){
               System.out.println(email);
           }

        }









    }
}
