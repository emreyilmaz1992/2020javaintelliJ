package day41_Inheritance;


public class AudioBook extends Book {

    // title, author, price // INHERITED
    // toString() inherited

    // length, listen()

    public String length;

    public void listen(){
        System.out.println("Listening to "+title);
    }


}
