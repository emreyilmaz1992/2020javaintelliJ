package Replit_Custom_Methods;

public class StoreProduct {

    String label;
    int price;
    String category;
    boolean hasExpiration;
    int stock;

    public StoreProduct(){

    }
    public StoreProduct(String label,int price){
        this.label = label;
        this.price = price;
        hasExpiration = false;
        stock = 0;
        category = "misc";

    }

    public StoreProduct(String label, int price, int stock){
        this.label = label;
        this.price = price;
        hasExpiration = false;
        this.stock = stock;
        category = "misc";

    }

    public StoreProduct(String label, int price,String category, boolean hasExpiration ){
        this.label = label;
        this.price = price;
        this.hasExpiration = hasExpiration;
        stock = 0;
        this.category = category;

    }
    public StoreProduct(String label, int price,String category, boolean hasExpiration,  int stock) {
        this.label = label;
        this.price = price;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
        this.category = category;
    }

    public void expired(boolean hasExpired){
      if(hasExpired){
          stock = 0;
    }

    }
    public boolean sale(int quantity){
        if(quantity <= stock){
            stock-= quantity;
            return true;
        }
        return false;
    }

    public double getDiscounted(double discount){

       double disc = price*(1 - discount);
       return disc;

    }

    public String toString(){

        return "Label: "+label+" Price: $"+price+" Expired: "+hasExpiration+
                " Stock: "+stock+" Category: "+category;

    }





}

