package day38_Constructor;
/*
2. create a class called Employee:
				instance variables:
						name, jobTitle, ID, salary
				add a constructor that can initialize name of employee
				add a constructor that can initialize name, jobTitle of the employee
							(apply constructor call to initialize the name)
				add a constructor that can initialize name, jobTitle, ID of the employee
							(apply constructor call to initialize the name and jobTitle)
				add a constructor that can initialize name, jobTitle, ID, salary of employee
							(apply constructor call to initialize the name, jobTitle, ID)
				add toString method
 */
public class Employee {

    String name;
    String jobTitle;
    int ID;
    double salary;

    public Employee(String name){
        this.name = name;
    }
    public Employee(String name, String jobTitle){
        this(name);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, String jobTitle, int ID){
        this(name, jobTitle);
        this.ID = ID;
    }
    public Employee(String name, String jobTitle, int ID, double salary){
        this(name,jobTitle,ID);
        this.salary = salary;
    }

    public String toString(){

        return "Name: "+name+", Job Title: "+jobTitle+", ID: "+ID+", Salary: $"+salary;


    }





}


