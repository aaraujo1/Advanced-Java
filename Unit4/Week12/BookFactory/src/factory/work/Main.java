package factory.work;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BookFactory bookFactory = new BookFactory();
        ArrayList<Book> books = new ArrayList<>();

        books.add(bookFactory.getBook(BookType.GRAPHICNOVEL));
        books.add(bookFactory.getBook(BookType.BIOGRAPHY));
        books.add(bookFactory.getBook(BookType.FICTION));
        books.add(bookFactory.getBook(BookType.GRAPHICNOVEL));

        for (Book b : books){
            b.displayBook();
        }
    }
}
