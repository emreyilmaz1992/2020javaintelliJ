package Repl_It0001;

public class Assestment_2_4 {
    public static void main(String[] args) {

        String sentence = "java is fun  java";
        String target = "java";

        System.out.println(appearsTwice("java","java is java fun  java"));








    }
    public static boolean appearsTwice(String target, String sentence) {

        int count = 0;

        for (int i = 0; i <1 ; i++) {

            while (sentence.contains(target)) {

                if (sentence.contains(target)) {
                    sentence = sentence.replaceFirst(target, " ");
                    count++;
                }
            }
            if(count == 2){
               return true;
            }
        }
        return false;
    }
}
