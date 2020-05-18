package day41_Inheritance;

public class Ebook  extends Book{
    // title, author, price // INHERITED
    // toString() inherited
    // size , pages, readbook

    public String size;
    public int pages;

    public void readBook(){
        System.out.println("Reading "+title);
    }


}
