package Replit_Custom_Methods;

public class Pizza {

    private String size;

    private int numOfCheese;
    private int numOfPepperoni;
    private int numOfHams;


    public Pizza(String size,int numOfCheese,int numOfPepperoni,int numOfHams){

    this.size =size;
    this.numOfCheese = numOfCheese;
    this.numOfHams = numOfHams;
    this.numOfPepperoni = numOfPepperoni;

    }
    public String getSize() {
        return size;
    }
    public int getNumberOfCheese(){
        return numOfCheese;
    }
    public int getNumberOfPepperoni(){
        return numOfPepperoni;
    }
    public int getNumberOfHam(){
        return numOfHams;
    }
    public void setSize(String size){
        this.size = size;
    }
    public void setNumberOfCheese(int numberOfCheese){
        this.numOfCheese = numberOfCheese;
    }
    public void setNumberOfPepperoni(int numberOfPepperoni){
        this.numOfPepperoni = numberOfPepperoni;
    }
    public void setNumberOfHam(int numberOfHam){
        this.numOfHams = numberOfHam;
    }






    public double calcCost(){

        double total = 0;

        if(size.equalsIgnoreCase("small")){
            total+= 2 *(numOfCheese+numOfPepperoni+numOfHams)+10;
        }else if(size.equalsIgnoreCase("medium")){
            total+= 2 *(numOfCheese+numOfPepperoni+numOfHams)+12;
        }else if(size.equalsIgnoreCase("large")){
            total+= 2 *(numOfCheese+numOfPepperoni+numOfHams)+14;
        }


        return total;
    }
    public String getDescription(){

        return size+" Pizza with "+numOfCheese+" Cheese toppings, "+numOfPepperoni+" Pepperoni topping, and "
                +numOfHams+" Ham toppings."+"\nTotal Price: "+ calcCost();

    }







}
