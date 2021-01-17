package Day55_Enums_Lambda.Lambdas.Unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unit1ExerciseWithoutLambda {
    public static void main(String[] args) {


        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carrol", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );







        //TODO Step 1 : Sort list by last name
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
        //people.sort(Comparator.comparing(Person::getLastName)); shortest version

        // TODO Step 2 : Create a method that prints all elements in the list
        printConditionally(people, p -> true);
        System.out.println("======================");

        // TODO Step 3 : Create a method that prints all people that have last name beginning with C

        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }
        });




    }



    private static void printConditionally(List<Person> people, Condition condition) {
        for(Person p : people){
           if(condition.test(p)){
               System.out.println(p);
           }
            }
        };

}
interface Condition{

    boolean test(Person p );

}
