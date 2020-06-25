package aye001;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CaloriMatic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double totalCaL =0; double totalPro = 0; double totalCarb = 0; double totalFat = 0;




        double calBulgur =  0.830;   double calChicken = 1.72;  double calOat  = 3.750;  double calPotato = 0.93 ;  double calAlmondButter = 95;    double calBanana = 105;  double calBagel = 250;  double calProteinShake = 200; double calBerry = 0.57;   double calEggWhite = 0.2;
        double proBulgur =  0.031;   double proChicken = 0.21;  double proOat  = 0.125;  double proPotato = 0.025;  double proAlmondButter = 7;     double proBanana = 1.33; double proBagel = 10;   double proProteinShake = 30;  double proBerry = 0.007;  double proEggwhite = 2.6;
        double crbBulgur =  0.190;   double crbChicken = 0.00;  double crbOat  = 0.675;  double crbPotato = 0.21 ;  double crbAlmodButter  = 7;     double crbBanana =  27;  double crbBagel = 49;   double crbProteinShake = 8;   double crbBerry = 0.14;   double crbEggwhite = 0.2;
        double fatBulgur =  0.002;   double fatChicken = 0.09;  double fatOat  = 0.075;  double fatPotato = 0.001;  double fatAlmondButter = 17;    double fatBanana = 0.4;  double fatBagel = 1.5;  double fatProteinShake = 4;   double fatBerry = 0.003;  double fatEggWhite = 0.1;

        double calSalmon = 0.208;    double calEgg = 78;        double calAlmond = 5.85 ;  double calPeanutButter = 95;   double calYogurt =  0.52; double calSpinach = 7;   double calMilk = 122;   double calSprout = 8;         double calOJ = 110;       double calNonYogurt = 90;
        double proSalmon = 0.200;    double proEgg =  6;        double proAlmond = 0.14 ;  double proPeanutButter = 7 ;   double proYogurt = 0.041; double proSpinach = 1;   double proMilk = 8;     double protSprout = 0.6;      double proOJ = 2;         double proNonYogurt = 18;
        double crbSalmon = 0.000;    double crbEgg = 0.6;       double crbAlmond = 0.217 ; double crbPeanutButter = 16;   double crbYogurt = 0.064; double crbSpinach = 1;   double crbMilk = 12;    double crbSprout = 1.7;       double crbOJ = 26;        double crbNonYogurt = 5;
        double fatSalmon = 0.130;    double fatEgg = 5;         double fatlmond  = 0.507;  double fatPeanutButter = 3;    double fatYogurt = 0.008; double fatSpimach = 0;   double fatMilk = 3;     double fatSprout = 0.1;       double fatOJ = 0;         double fatNonYogurt = 0;

        double calAvocado = 1.6;     double calNonMilk= 90;     double calPopcorn = 0.94;
        double proAvocado = 0.02;    double proNonMilk= 8;      double proPopCorn = 0.03;
        double crbAvocado = 0.09;    double crbNonMilk = 13;    double crbPopCorn = 0.197;
        double fatAvocado = 0.143;    double fatNonMilk = 0;     double fatPopCorn = 0.011;



        while (true){
            DecimalFormat DF = new DecimalFormat("0.00");
                int i = 0;
            while(i <=15) {
                System.out.println("What have you eaten today?");
                String food = input.nextLine();
                if(food.equalsIgnoreCase("done")) {
                    System.out.println("Total Calories intake :"+(DF.format(totalCaL))+"  You need: "+(2600-totalCaL)+" more!");
                    System.out.println("Total Protein  intake :"+(DF.format(totalPro)+"   You need: "+(202-totalPro)+"  more!"));
                    System.out.println("Total Carb     intake :"+(DF.format(totalCarb)+"  You need: "+(265-totalCarb)+" more!"));
                    System.out.println("Total Fat      intake :"+(DF.format(totalFat))+"  You need: "+(75-totalFat)+"   more!");
                    break;
                }
                System.out.println("How many gram|piece|spoon you ate?");
                double gram = input.nextDouble();
                input.nextLine();


                if (food.equalsIgnoreCase("Bulgur")  ) {
                    totalCaL += (calBulgur * gram);
                    totalPro += (proBulgur * gram);
                    totalCarb += (crbBulgur * gram);
                    totalFat += (fatBulgur * gram);

                       // break;

                } else if (food.equalsIgnoreCase("Salmon")) {
                    totalCaL += (calSalmon * gram);
                    totalPro += (proSalmon * gram);
                    totalCarb += (crbSalmon * gram);
                    totalFat += (fatSalmon * gram);
                    //break;
                }  else if (food.equalsIgnoreCase("Popcorn")) {
                    totalCaL += (calPopcorn * gram);
                    totalPro += (proPopCorn * gram);
                    totalCarb += (crbPopCorn * gram);
                    totalFat += (fatPopCorn * gram);
                    //break;
                } else if (food.equalsIgnoreCase("nonfat milk")) {
                    totalCaL += (calNonMilk * gram);
                    totalPro += (proNonMilk * gram);
                    totalCarb += (crbNonMilk * gram);
                    totalFat += (fatNonMilk * gram);
                    //break;
                } else if (food.equalsIgnoreCase("Chicken")) {
                    totalCaL += (calChicken * gram);
                    totalPro += (proChicken * gram);
                    totalCarb += (crbChicken * gram);
                    totalFat += (fatChicken * gram);
                   // break;
                } else if (food.equalsIgnoreCase("Eggs")) {
                    totalCaL += (calEgg * gram);
                    totalPro += (proEgg * gram);
                    totalCarb += (crbEgg * gram);
                    totalFat += (fatEgg * gram);
                   // break;
                } else if (food.equalsIgnoreCase("NonFat Yogurt") || food.equalsIgnoreCase("Non Fat")) {
                    totalCaL += (calNonYogurt * gram);
                    totalPro += (proNonYogurt * gram);
                    totalCarb += (crbNonYogurt * gram);
                    totalFat += (fatNonYogurt * gram);
                    // break;
                }
                else if (food.equalsIgnoreCase("OatMeal") || food.equalsIgnoreCase("oat")) {
                    totalCaL += (calOat * gram);
                    totalPro += (proOat * gram);
                    totalCarb += (crbOat * gram);
                    totalFat += (fatOat * gram);
                    //break;
                } else if (food.equalsIgnoreCase("Almond")) {
                    totalCaL += (calAlmond * gram);
                    totalPro += (proAlmond * gram);
                    totalCarb += (crbAlmond * gram);
                    totalFat += (fatlmond * gram);
                    //break;
                } else if (food.equalsIgnoreCase("Avocado")) {
                    totalCaL += (calAvocado * gram);
                    totalPro += (proAvocado * gram);
                    totalCarb += (crbAvocado * gram);
                    totalFat += (fatAvocado * gram);
                    //break;
                }
                else if (food.equalsIgnoreCase("Egg white")) {
                    totalCaL += (calEggWhite * gram);
                    totalPro += (proEggwhite * gram);
                    totalCarb += (crbEggwhite * gram);
                    totalFat += (fatEgg * gram);
                    //break;
                }
                else if (food.equalsIgnoreCase("potato")) {
                    totalCaL += (calPotato * gram);
                    totalPro += (proPotato * gram);
                    totalCarb += (crbPotato * gram);
                    totalFat += (fatPotato * gram);
                    //break;
                } else if (food.equalsIgnoreCase("Peanut Butter")) {
                    totalCaL += (calPeanutButter * gram);
                    totalPro += (proPeanutButter * gram);
                    totalCarb += (crbPeanutButter * gram);
                    totalFat += (fatPeanutButter * gram);
                   // break;
                } else if (food.equalsIgnoreCase("Almond butter")) {
                    totalCaL += (calAlmondButter * gram);
                    totalPro += (proAlmondButter * gram);
                    totalCarb += (crbAlmodButter * gram);
                    totalFat += (fatAlmondButter * gram);
                   // break;
                } else if (food.equalsIgnoreCase("Yogurt")) {
                    totalCaL += (calYogurt * gram);
                    totalPro += (proYogurt * gram);
                    totalCarb += (crbYogurt * gram);
                    totalFat += (fatYogurt * gram);
                   // break;
                }else if (food.equalsIgnoreCase("Spinach")) {
                    totalCaL += (calSpinach * gram);
                    totalPro += (proSpinach * gram);
                    totalCarb += (crbSpinach * gram);
                    totalFat += (fatSpimach * gram);
                    //break;
                } else if (food.equalsIgnoreCase("Bagel")) {
                    totalCaL += (calBagel * gram);
                    totalPro += (proBagel * gram);
                    totalCarb += (crbBagel * gram);
                    totalFat += (fatBagel * gram);
                   // break;
                }else if (food.equalsIgnoreCase("Banana")) {
                    totalCaL += (calBanana * gram);
                    totalPro += (proBanana * gram);
                    totalCarb += (crbBanana * gram);
                    totalFat += (fatBanana * gram);
                    //break;
                }else if (food.equalsIgnoreCase("Milk")) {
                    totalCaL += (calMilk * gram);
                    totalPro += (proMilk * gram);
                    totalCarb += (crbMilk * gram);
                    totalFat += (fatMilk * gram);
                }else if (food.equalsIgnoreCase("OJ")|| food.equalsIgnoreCase("orange juice")) {
                        totalCaL += (calOJ * gram);
                        totalPro += (proOJ * gram);
                        totalCarb += (crbOJ* gram);
                        totalFat += (fatOJ * gram);

                }else if (food.equalsIgnoreCase("Protein Shake") || food.equalsIgnoreCase("Protein")) {
                    totalCaL += (calProteinShake * gram);
                    totalPro += (proProteinShake * gram);
                    totalCarb += (crbProteinShake* gram);
                    totalFat += (fatProteinShake * gram);
                }else if (food.equalsIgnoreCase("Bruksel")|| food.equalsIgnoreCase("sprout") ) {
                    totalCaL += (calSprout * gram);
                    totalPro += (protSprout * gram);
                    totalCarb += (crbSprout * gram);
                    totalFat += (fatSprout * gram);
                }else if (food.equalsIgnoreCase("Blueberry") || food.equalsIgnoreCase("Berry")) {
                        totalCaL += (calBerry * gram);
                        totalPro += (proBerry * gram);
                        totalCarb += (crbBerry* gram);
                        totalFat += (fatBerry * gram);


                /*else if (food.equalsIgnoreCase("nothing")) {
                    totalCaL += (0);
                    totalPro += (0);
                    totalCarb += (0);
                    totalFat += (0);
                    System.out.println("Total calories intake :"+(totalCaL)+"   "+"You need: "+(2600-totalCaL)+" more!");
                    System.out.println("Total protein intake : "+totalPro+"     "+"You need: "+(202-totalPro)+"  more!");
                    System.out.println("Total Carbohydrate intake "+totalCarb+" "+"You need: "+(265-totalCarb)+" more!");
                    System.out.println("Total Fat intake :"+(totalFat)+"        "+"You need: "+(75-totalFat)+"   more!");
                    break;

                 */
                } else{
                    System.out.println("Invalid");
                    //input.nextLine();
                }
                    i++;
            }

                while(true){
                    System.out.println("Do you want to continue?");
                    String answer = input.next();
                    if (answer.equalsIgnoreCase("yes")) {
                        input.nextLine();
                        break;
                    } else if (answer.equalsIgnoreCase("no")  ) {
                        System.out.println("Total calories intake :"+(DF.format(totalCaL))+"    "+"You need: "+(2600-(totalCaL))+" more!");
                        System.out.println("Total protein intake : "+(DF.format(totalPro)+"     "+"You need: "+(202-totalPro)+"  more!"));
                        System.out.println("Total Carbohydrate intake "+(DF.format(totalCarb)+" "+"You need: "+(265-totalCarb)+" more!"));
                        System.out.println("Total Fat intake :"+(DF.format(totalFat))+"         "+"You need: "+(75-totalFat)+"   more!");


                    } else {
                        System.out.println("Please enter valid answer! (Yes or No)");
                    }
                }
        }

























    }
}
