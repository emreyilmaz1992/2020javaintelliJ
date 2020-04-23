package day06_Shorthnd_LogicalOperators;

public class ShortHandOperators {
    public static void main(String[] args) {

        int x = 20;
            x+= 10; // x = x+10 ==>30
        System.out.println(x);

        x += 60; //x = x+60
        System.out.println(x); //90

        String schoolname = "CyberTek";
               schoolname+= 12345; //schoolname= schoolname + 12345
        System.out.println(schoolname); //CyberTek123456

        System.out.println('a'+'b'); //195
                        //  97+98 = 195

        char ch1 = 'a'; // 97
             ch1+= 'b'; // 98
        System.out.println(ch1); // Ã

        int num = 'z';
            num+= 'x';
        System.out.println(num); //242

        int A = 100;
            A-=  90; //10
        System.out.println(A);

        int B = 200;
            B-= A; //190

        int y =10;
            y-=5; //5

        int w=15;
            w-= y;
        System.out.println(w); //10

        int a1 = 100;
        int b1 = (a1*= 2) + ++a1;
          //b1 = 200    + 201
          //b1 = 401

        int x1 = 10;
        int y1 = x1+= 10*2;  //x1 = x1+20
                             //x1+= 20  ==>30

        int q = 20;
        int p = q *= 20*3;
              //q *= 60     q = q *60

        System.out.println("++++++++++++++++++++++++++++++" );

        int num1 = 300;
        num1 /= 2; //150

        int num2 = 400;
            num2 /= 20 +10; // 400 / 30 ==> 13 everything  rught side of the equall'=' has to be calculated first.


        int num3 = 300;
            num3%= 10+20; // 0

        int n1 = 400;
            n1%= 3*15; //10







    }
}
