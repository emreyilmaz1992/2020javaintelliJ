package aye001.Comparison_Comparable;

public class Person implements Comparable<Person> {


    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [name="
                +name+", age="+age+ "]";
    }

    @Override // we could also generate hashcode and equals method without writing it by ourself
    public int hashCode() {
        return 1000;
    }

    @Override
    public boolean equals(Object obj) {
        Person p = (Person) obj;
        if(this.name.equals(p.name )&& this.age == p.age){
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Person o) {

        return ( this.name.compareTo(o.name)==0)
                ? Integer.compare(this.age,o.age)
                : this.name.compareTo(o.name);


//        if(this.name.charAt(0)> o.name.charAt(0)){
//            return 1;
//        }else if(this.name.charAt(0) == o.name.charAt(0)){
//            if(this.age > o.age){
//                return 1;
//            }else if(this.age == o.age){
//                return 0;
//            }else{
//                return -1;
//            }
//        }else {
//            return -1;
//        }
//
//
    }
}
