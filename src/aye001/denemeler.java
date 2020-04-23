package aye001;

import java.util.Scanner;

public class denemeler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter name");
        String Name = input.next();

        if(Name.contains("a")){
            System.out.println("yes");
        }else{
            System.out.println(Name);
        }

    }
}
