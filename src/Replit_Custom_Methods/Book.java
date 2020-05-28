package Replit_Custom_Methods;

public class Book {

    String title;
    String author;
    String tableOfContents= "";
    int nextPage = 1;

    public Book(String title, String author){
        this.author = author;
        this.title = title;

    }

    public void addChapter(String titleChapter, int totalPages){


        tableOfContents += "\n"+titleChapter+"..."+nextPage;
        nextPage+= totalPages;

    }

    public int getNextPage(){
        return nextPage-1;
    }

    public String getTableOfContents() {
        return tableOfContents;
    }

    public String toString(){
        return "Title: "+title+
                "\nCharacter: "+author;
    }


}

class dene{
    public static void main(String[] args) {

        Book book1 = new Book("Improbable","Adam Fawer");

        book1.addChapter("Probability",45);
        System.out.println(book1.getNextPage());
        System.out.println(book1.getTableOfContents());
        book1.addChapter("Luck",78);
        System.out.println(book1.getTableOfContents());
        System.out.println(book1.nextPage);
        System.out.println(book1);


    }
}
