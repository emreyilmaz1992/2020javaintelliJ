package day09_Nested_Ternary;

public class ageGroups_NestedIF {

    /* Write a program can define the age groups oof a person
        age groups are:
        teenager(<21)
        Adult ( >=21 && <55)
        senior ( >55)

        age cannot be negative or greater than 150
     */

    public static void main(String[] args) {

        int age = 27;
        String ageGroup = "";

        if(age < 150 && age > 0){

            if (age < 21){

                ageGroup = "Teenager";
            }else if (age <55){

                ageGroup = "Adult";
            }else{
                ageGroup = "Senior";
            }

        }else{
            ageGroup = "Invalid Entry";
        }
        System.out.println(ageGroup);

        String ageGroup2 = "";


        if(age<150 && age >0){
            ageGroup2 = (age < 21) ? "Teenager" : (age < 55) ? "Adult" : "Senior";
        }else{
            ageGroup2="Invalid entry";
        }
        System.out.println(ageGroup2);






    }



}
