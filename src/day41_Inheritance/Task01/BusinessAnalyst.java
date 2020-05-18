package day41_Inheritance.Task01;

public class BusinessAnalyst extends Employee {
     /*
      name(Inherited)
    salary(Inherited)
    id(Inherited)
    jobTitle(Inherited)
    gender(Inherited)
    toString()
    WritingReq();
    gathering();
         */

    public BusinessAnalyst(double salary, String name, long id, String jobTitle, char gender){
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void gathering(){
        System.out.println(name+" gathering documents");
    }
    public void writingReq(){
        System.out.println(name+" writing documents");
    }

}
