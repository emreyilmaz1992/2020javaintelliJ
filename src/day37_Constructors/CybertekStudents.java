package day37_Constructors;

public class CybertekStudents {

    static String schoolName ="Cybertek";
    String name; // we must need to know
    int groupNumber; // we must need to know
    String batch; // we must need to know

    public CybertekStudents(String name, int groupNumber, String batch) {

        //schoolName = "Cybertekke";
        this.name = name;
        this.groupNumber = groupNumber;
        this.batch = batch;


    }

    public String toString() {
        return "Name: " + name + ", Batch: " + batch +
                ", in group: " + groupNumber + ", School name: " + schoolName;
    }
}


    class CObject{

        public static void main(String[] args) {

            CybertekStudents student1 = new CybertekStudents("Emre",13,"Batch 18");

            student1.schoolName = "MIT"; // since its static , when we change it both students' school name will be change as MIT

            System.out.println(student1);

            CybertekStudents student2 = new CybertekStudents("Kemal",14,"Batch18");

            System.out.println(student2);

        }


    }



