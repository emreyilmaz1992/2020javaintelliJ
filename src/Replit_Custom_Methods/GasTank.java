package Replit_Custom_Methods;

public class GasTank {

    double amount = 0;
    double capacity;

    public GasTank(double capacity) {
        this.capacity = capacity;
    }

    public void addGas(double addedGas) {

        if (amount + addedGas >= capacity) {
            amount = capacity;
        } else {
            amount += addedGas;
        }
    }

    public void useGas(double usedGas){

        if(amount - usedGas < 0){
            amount = 0;
        }else {
            amount = amount- usedGas;
        }

    }

    public boolean isEmpty() {
        if (amount < ( 0.1)) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (amount >  (capacity - 0.1)) {
            return true;
        }
        return false;
    }

    public double getGasLevel() {
        return amount;
    }

    public double fillUP() {


        return capacity - amount;

    }


    public static void main(String[] args) {

        GasTank tank1 = new GasTank(50);

        tank1.addGas(40);

        System.out.println(tank1.getGasLevel());
        System.out.println(tank1.isFull());
        System.out.println(tank1.isEmpty());
        System.out.println(tank1.fillUP());



    }
}

