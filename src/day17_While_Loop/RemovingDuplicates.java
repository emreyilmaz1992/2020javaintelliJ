package day17_While_Loop;

public class RemovingDuplicates {
    public static void main(String[] args) {
        String str = "Java is fun, Java is cool";



        int count =0;
        while (str.contains("Java")){
            count++;
            str = str.replaceFirst("Java",""); // after counting the first java we need to remove it.
                                                                    // cuz we don't wanna count it again



        }
        System.out.println(count);

        String word = "Cybertek School is great place";


        int num = 0;

        while(word.contains("i")){
            num++;
            word =word.replaceFirst("i",""); // how many i
        }
        System.out.println(num);


    }
}
