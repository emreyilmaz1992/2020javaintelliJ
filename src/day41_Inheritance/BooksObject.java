package day41_Inheritance;

public class BooksObject {
    public static void main(String[] args) {

        Ebook Ebook1 = new Ebook();

        Ebook1.title = "Improbable";
        Ebook1.price = 10;
        Ebook1.author = "Adam Fewer";

        Ebook1.size =" 1.5MB";
        Ebook1.pages= 360;

        System.out.println(Ebook1);
        System.out.println("Size: "+Ebook1.size);
        System.out.println("Pages: "+Ebook1.pages);

        Ebook1.readBook();

        System.out.println("=======================");

        AudioBook Audio1 = new AudioBook();

        Audio1.title = "Robinson Crusoe";
        Audio1.price = 12;
        Audio1.author = "Daniel Defoe";
        Audio1.length = "19 hours and 3 munites";

        System.out.println(Audio1);
        System.out.println("Length of the "+Audio1.title+" is "+Audio1.length);









    }
}
