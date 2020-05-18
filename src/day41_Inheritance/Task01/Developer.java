package day41_Inheritance.Task01;
/*
create subclass of employee name it developer:
	     variables: salary, name, id, jobTitle, gender
	     action: fixingBug, coding
	     create a constructor that can initialize all the attributes of developer
 */
public class Developer extends Employee{
    /*
      name(Inherited)
    salary(Inherited)
    id(Inherited)
    jobTitle(Inherited)
    gender(Inherited)
    fixingBug()
    coding()
     */
    public void fixingBug(){
        System.out.println(name+" is fixing bug");
    }
    public void coding(){
        System.out.println(name+" is coding");
    }
    public Developer(double salary, String name, long id, String jobTitle, char gender){
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

}
