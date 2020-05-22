package Replit_Custom_Methods;

public class UAGStudent {
    String name;
    int grade;
    static String principalName = "Ms. McKoy";
    String studentID;
    static int nextID = 100;


    public UAGStudent(String name, int grade) {
        String result ="";
        this.name = name;
        this.grade = grade;

        studentID = name.substring(0,1).toUpperCase()+nextID;
        nextID++;
    }

    public static void  newPrincipal(String newKing){
        principalName = newKing;
    }

    public static void resetID(){
        nextID = 100;
    }

    public String toString(){

        return "Student's name: ,"+"Student's ID: "+studentID;

    }







}

class check5 {


    public static void main(String[] args) {

        UAGStudent s1 = new UAGStudent("Muhammed",11);
        UAGStudent s2 = new UAGStudent("Alan",11);
        UAGStudent s3 = new UAGStudent("Sophie",11);
        System.out.println(s1.studentID);
        System.out.println(s2.studentID);
        System.out.println(s3.studentID);

        UAGStudent.newPrincipal("ogretmen kemal");
        System.out.println(UAGStudent.principalName);

        UAGStudent.resetID();
        UAGStudent s4 = new UAGStudent("kevin",11);
        System.out.println(s4);




    }
}
