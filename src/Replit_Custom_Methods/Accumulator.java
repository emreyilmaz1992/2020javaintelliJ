package Replit_Custom_Methods;

public class Accumulator {
    int sum;


    public Accumulator(int sum)
    {
        this.sum = sum;
    }

    public int getSum(){

        return sum;
    }

    public void add(int added){
        sum+= added;
    }
    public void remove(int removed){
        sum-= removed;
    }

    @Override
    public String toString() {
        return  "Sum is: "+sum;

    }
}
class check {

    public static void main(String[] args) {


        Accumulator num1 = new Accumulator(10);
        num1.remove(2);
        num1.add(4);
        System.out.println(num1);
    }
}