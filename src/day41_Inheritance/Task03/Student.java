package day41_Inheritance.Task03;
/*
create a subclass of Person called Student
				attributes: name, age, gender, studentID, class, school name = "cybertek"
				methods: attendClass, code, setStudentInfo, toString
 */
public class Student extends Person {

    public long studentID;
    public String clazz;
    public static String schoolName ="CyberTek";



    public void setStudentInfo(String name, int age, char gender, long studentID, String clazz){
        setPersonInfo(name, age, gender);
        this.studentID = studentID;
        this.clazz= clazz;

    }
    public void attendClass(){
        System.out.println(name+" is attending "+clazz);
    }

    public void code(){
        System.out.println(name+" is coding");
    }

    public String toString(){
        return "Name: "+name+" ID: "+studentID+",  Age: "+age+", Gender: "+gender+", School "+schoolName+", Class: "+clazz;
    }

}
