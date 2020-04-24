package day22_Arrays_Loops;

public class _03_WarmUp_Unique {
    public static void main(String[] args) {
        /*
        1.  Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop
         */
        String [] arr = {"A","B","A"};




        for(String each2 :arr ) {
            int count = 0;
            for (String each : arr) {
                if (each.equals(each2)) {
                    count++;
                }


            }
            if (count == 1) {
                System.out.println(each2);
            }
        }






    }
}
