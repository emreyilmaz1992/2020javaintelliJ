package Replit_Custom_Methods;

public class Pizza {

    private String size;
    private int numOfCheese;
    private int numOfPepperoni;
    private int numOfHam;

    public Pizza(String size, int numOfCheese,int numOfPepperoni,int numOfHam){

        this.size =size;
        this.numOfCheese = numOfCheese;
        this.numOfPepperoni = numOfPepperoni;
        this.numOfHam = numOfHam;

    }

    public int getNumOfCheese() {

        return numOfCheese;
    }
    public  int getNumOfPepperoni(){

        return numOfPepperoni;
    }
    public int getNumOfHam(){
        return numOfHam;
    }
    public void setSize(String size){
        this.size =size;
    }

    public void setNumOfCheese(int numOfCheese) {
        this.numOfCheese = numOfCheese;
    }

    public void setNumOfHam(int numOfHam){
        this.numOfHam = numOfHam;
    }

    public double calCost(){

        double total = 0;

        if(size.equalsIgnoreCase("small")){
            total+= (numOfPepperoni+numOfHam+numOfCheese)*2+10;
        }else if(size.equalsIgnoreCase("medium")){
            total+= (numOfPepperoni+numOfHam+numOfCheese)*2+12;
        }else if(size.equalsIgnoreCase("large")){
            total+= (numOfPepperoni+numOfHam+numOfCheese)*2+14;
        }

        return total;

    }

    public String getDescription(){
        return size+" Pizza with "+numOfCheese+" Cheese toppings, "+numOfPepperoni+" Pepperoni toppings, and "+
                numOfHam+" Ham toppings."+
                "\nTotal Price: "+calCost();




    }
}
