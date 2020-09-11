package aye001.Comparison_Comparable;

import java.util.*;

public class ComparinObject {
    public static void main(String[] args) {

        List<String>lst = new ArrayList<>();
        lst.addAll(Arrays.asList("Adam","John","Mary","Diana"));

        System.out.println(lst);
        Collections.sort(lst);
        System.out.println(lst);

        Collections.sort(lst,Collections.reverseOrder());
        System.out.println(lst);

        List<Person> plst= new ArrayList<>();
        plst.add(new Person("John",20));
        plst.add(new Person("Adam",32));
        plst.add(new Person("Mary",10));
        plst.add(new Person("John",10));
        plst.add(new Person("John",15));
        System.out.println(plst);

        Collections.sort(plst);
        System.out.println(plst);

        // now we use it from PersonNameComparator
        System.out.println("================================");

        List<Person> plst2= new ArrayList<>();
        plst2.add(new Person("John",20));
        plst2.add(new Person("Adam",32));
        plst2.add(new Person("Mary",10));
        plst2.add(new Person("John",10));
        plst2.add(new Person("John",15));

        System.out.println(plst2);

        Comparator<Person> comp = new PersonNameComparator();
        Collections.sort(plst2,comp);
        System.out.println(plst);

        // now we re gonna do it by using the lambda expression

        Comparator<Person> ageComparator = Comparator.comparing(p -> p.age);

        Collections.sort(plst2,ageComparator);
        System.out.println(plst2);

        Comparator<Person> nameComparator = (o1,o2)->o1.name.compareTo(o2.name);
        Collections.sort(plst2,nameComparator);
        System.out.println(plst2);


        Comparator<Person> reverseComparator = (o1,o2)->o2.name.compareTo(o1.name);
        Collections.sort(plst2,reverseComparator);
        System.out.println(plst2);

        // Now we will combine 2 comparator method

        Comparator<Person>nameRThenAgeComp=reverseComparator.thenComparing(ageComparator.reversed());
        Collections.sort(plst2,nameRThenAgeComp);

        System.out.println(plst2);






    }
}
