package day46_final_abstract;

public class _02_Final_Encapsulation {

    final private int data1= 200;
    private int data2= 300;

    public int getData1() {

        return data1;
    }
    /*
    public void setData1(int data1){ //we cannot reassigned, however we can generate getter,
        this.data1 = data1; NO SET
    }

     */

    public int getData2() {

        return data2;
    }

    public void setData2(int data2) {

        this.data2 = data2;
    }
}
