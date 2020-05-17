package day40_Encapsulation;

public class Person {

    private long SNN;
    private long ID;
    public String name;

    public Person(String name){

        this.name = name;
    }

    public long getID() {
        return ID;
    }

    public long getSNN() {
        return SNN;
    }

    public void setSNN(long SNN){
        this.SNN = SNN;

    }

    public void setID(long ID) {
        this.ID = ID;
    }
    public void setSSNandID(long SSN, long ID){
        setSNN(SSN);
        setID(ID);
    }
}
