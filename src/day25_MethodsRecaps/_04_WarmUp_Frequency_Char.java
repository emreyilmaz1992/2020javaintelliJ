package day25_MethodsRecaps;

public class _04_WarmUp_Frequency_Char {
    public static void main(String[] args) {
        /*
        Warmup tasks:
	1. write a return method called frequency that accepts two parameters: string str and char ch,
		the method returns the frequency of the ch from the str as an int
			Ex:
				frequency("AAA", 'A') ==>  3
				frequency("ABAB", 'B') ==> 2
			Note: MUST use Arrays and for each loop
	2. use the above method to create another called uniques that accepts a string paramter and returns it's unique characters as String
			Ex: uniques("ABBC"); 		==> "AC"
				uniques("Cybertek");  	==> "cybrtk"
         */


        String str = "AAA";
        char ch = 'A';

        char [] arr = str.toCharArray();
        int count = 0 ;
        for (char each : arr){
            if(each ==ch ){
                count++;
            }
        }
        System.out.println(count);






    }
    public static int frequency (String str , char ch){
       // String str = "AAA";
       // char ch = 'A';

        char [] arr = str.toCharArray();
        int count = 0 ;
        for (char each : arr){
            if(each ==ch ){
                count++;
            }
        }
        return count;
    }
}
