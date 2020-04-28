package Repl_It0001;

public class _168_Method_Cover {
    public static void main(String[] args) {

        System.out.println(coverString("java java java","ja"));








    }
    public static String coverString(String main, String coverME){
        if(main.contains(coverME)){
            main = main.replace(coverME, "["+coverME+"]");
        }else{
            main = "["+main+"]";
        }
        return main;
    }
}
