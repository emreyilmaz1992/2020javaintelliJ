package Day55_Enums_Lambda.Lambdas.Unit2;

import Day55_Enums_Lambda.Lambdas.Unit1.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PersonLambda {
    public static void main(String[] args) {


        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carrol", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        //TODO Step 1 : Sort list by last name

        Collections.sort(people,(p1, p2) -> p1.getLastName().compareTo(p2.getLastName()) );

        // TODO Step 2 : Create a method that prints all elements in the list
        performConditionally(people, p -> true, System.out::println);
        System.out.println("======================");

        // TODO Step 3 : Create a method that prints all people that have last name beginning with C
        performConditionally(people, p -> p.getLastName().startsWith("C"),p -> System.out.println(p));
        System.out.println("=======================");

        // TODO Step 4 : Print the first names that start with C
        performConditionally(people, p -> p.getFirstName().startsWith("C"),p -> System.out.println(p.getFirstName()));


    }



    private static void performConditionally(List<Person> people, Predicate<Person>predicate, Consumer<Person>consumer) {
        for(Person p : people){
            if(predicate.test(p)){ // this test here doesn't come from interface we used unit 1
                consumer.accept(p);
            }
        }
    };

}
