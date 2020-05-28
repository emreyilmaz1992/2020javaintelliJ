package day44_Exceptions;

/*
warmup task:
	1. create a class called Browsers
			actions: openBrowser(): opens the default browser
					 closeBrowser(): closes the default browser
	2. create a class called ChromeBrowser
			actions: openBrowser(): opens the chrome browser
					 closeBrowser(): closes the chrome browser
	3. creata a class called FirefoxBrowser
			actions: openBrowser(): opens the Firefox browser
					 closeBrowser(): closes the Firefox browser
	4. create a class called Opera browser
			actions: openBrowser(): opens the Opera browser
					 closeBrowser(): closes the Opera browser
	5. create a class called Test:
			create an object of each browsers and call the openBrowser & closeBrowser actions
:heavy_check_mark:
4


 */
public class Browsers {

    protected void openBrowser(){
        System.out.println("Opening the default browser");
    }

    protected void closeBrowser(){
        System.out.println("Closing the default browser");
    }

}

class ChromeBrowser extends Browsers{

    public void openBrowser(){
        System.out.println("Opening the Chrome browser");
    }
    public void closeBrowser(){
        System.out.println("Closing the Chrome browser");
    }

}

class FirefoxBrowser extends Browsers{
    public void openBrowser(){
        System.out.println("Opening the Firefox browser");
    }
    public void closeBrowser(){
        System.out.println("Closing the Firefox browser");
    }
}
class OperaBrowser extends Browsers{
    public void openBrowser(){
        System.out.println("Opening the Opera browser");
    }
    public void closeBrowser(){
        System.out.println("Closing the Opera browser");
    }
}



class Test {
    public static void main(String[] args) {


        ChromeBrowser Chrome = new ChromeBrowser();
        Chrome.openBrowser();
        Chrome.closeBrowser();

        FirefoxBrowser Firefox = new FirefoxBrowser();
        Firefox.openBrowser();
        Firefox.closeBrowser();

        OperaBrowser Opera = new OperaBrowser();
        Opera.openBrowser();
        Opera.closeBrowser();
    }
}














