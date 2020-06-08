package day46_final_abstract;

import javafx.print.PageLayout;

public abstract class Employee {

    public String name;
    public int age;
    public char gender;
    public double salary;
    public String jobTitle;

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
class Tester extends Employee{

    public Tester(String name, int age, char gender, double salary, String jobTitle){
        this.name =name;
        this.age = age;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public void work(){
        System.out.println(name+" is testing");
    }


}

class Developer extends Employee{
    public Developer(String name, int age, char gender, double salary, String jobTitle){
        this.name =name;
        this.age = age;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public void work(){
        System.out.println(name+" is developing");
    }


}
class Test3{
    public static void main(String[] args) {

        Tester tester = new Tester("Emre",27,'M',120000,"SDET");

        tester.work();




    }

}
