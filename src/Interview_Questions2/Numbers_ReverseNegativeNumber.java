package Interview_Questions2;

public class Numbers_ReverseNegativeNumber {
    public static void main(String[] args) {

    //Write a return method that can reverse negative number and return it as int

      int a = -123;
        System.out.println(reverseInt(a));








    }
    public static int reverseInt(int num){

        String str = new StringBuilder(""+num).reverse().toString();
        //321-

        if(num<0){

            str = "-"+str.substring(0,str.length()-1);
        }

        return Integer.valueOf(str);

    }

}
