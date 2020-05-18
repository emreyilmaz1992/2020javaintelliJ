package Replit_Custom_Methods;

public class TV {

    int channel = 1;
    int volumeLevel = 1;
    boolean on = true;
    String brand = "undefined";

    public TV(){
        System.out.println("Creating TV object using no Args- constructor");
    }

    public TV(String brand){

        this.brand = brand;

        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getVolumeLevel(){
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel){

        this.volumeLevel=volumeLevel;

        if(isON()){
            if(volumeLevel<1 && volumeLevel>7){
                System.out.println("ERROR: TV is either OFF or invalid Volume level");
            }
        }
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
        if(isON()) {
            if (channel > 0 && channel < 120) {
                this.channel = channel;
            } else {
                System.out.println("ERROR: TV2 is either OFF or invalid Channel");
            }
        }

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void  channelUp(){

        channel++;

    }

    public void channelDown(){

       channel--;
    }


    public void volumeUp(){

        volumeLevel++;
    }
    public void volumeDown(){

        volumeLevel--;
    }

    public boolean isON(){

    return on;


    }
    public void turnOn(){

        if(on){
            System.out.println("TV is already on!");
        }else {
            on = false;
        }


    }

    public void turnOff(){
       if(!on){
           System.out.println("TV is already off");
       }else {
           on = true;
       }
    }

    @Override
    public String toString() {
        return "TV{" +
                "channel=" + channel +
                ", volumeLevel=" + volumeLevel +
                ", on=" + on +
                ", brand='" + brand + '\'' +
                '}';
   }
}
class TVT{
    public static void main(String[] args) {

        TV tv = new TV();

        tv.setBrand("Samsung");

        tv.turnOff();
        System.out.println(tv.isON());
        tv.setChannel(120);
        tv.setVolumeLevel(4);
        tv.volumeDown();
        tv.channelUp();
        System.out.println(tv);








    }




}