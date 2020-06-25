package day50_Polymorphism;

public class Encapsulation {

    private  String userName = "Cybertek";

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

class Test{

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
      //  System.out.println(obj.username); since it's private  we can not access through object name
        obj.setUserName("Columbia");
        System.out.println(obj.getUserName());

    }



}
