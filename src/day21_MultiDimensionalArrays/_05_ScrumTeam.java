package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class _05_ScrumTeam {
    public static void main(String[] args) {

        String [] DevTeam = {"Ahmet","Mehmet","Kemal","Cemal"};
        String [] Testers = {"Muslum","Kazim","Orhan","Kamil"};
        String [] PO      = {"Celil","Behcet"};

        String[] TestersTeam2 = {"Donatello","Rafael","Mikelencelo","Leonardo"};

        String ScrumTeam [][] = {DevTeam , Testers , PO};

                ScrumTeam[0][3] = "Murat"; // cemal out
        System.out.println( ScrumTeam[0][3]);

        ScrumTeam[1] = TestersTeam2;
        System.out.println(Arrays.toString(ScrumTeam[1]));



        System.out.println("================================================");

        for( String eachEmployee : ScrumTeam[0]){
            System.out.println(eachEmployee);

        }




    }
}
