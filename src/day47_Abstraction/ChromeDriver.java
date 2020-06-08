package day47_Abstraction;

public class ChromeDriver extends RemoteWebDriver {


    public void get(String URL){
        System.out.println("Opening "+URL+" in chrome browser");
    }

    @Override
    protected void get() {

    }


}
