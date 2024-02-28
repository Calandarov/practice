package practice.task30.subtask3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class LibTest {
    Lib lib;
    Book book;

    @Test
    public void addBook() {
        lib = new Lib();
        book = new Book();
        book.setTitle("TestQ");
        book.setAuthor("TestQ");
        book.setYear(2000);
        book.setNumberPages(3000);

        lib.addBook(book);

        Assertions.assertEquals(6, lib.getLib().length);
    }

    @Test
    public void deleteBook() {
        lib = new Lib();
        book = new Book();
        book.setTitle("TestW");
        book.setAuthor("TestW");
        book.setYear(2005);
        book.setNumberPages(7000);

        lib.addBook(book);

        lib.deleteBook(book);
        Assertions.assertEquals(5, lib.getLib().length);
    }

    @Test
    public void printBook() {
        lib = new Lib();
        String expectedLib = "[title: 'Test', author: 'Test', year: 2024, numberPages: 1000}" +
                ", title: 'Test', author: 'Test', year: 2024, numberPages: 1000}" +
                ", title: 'Test', author: 'Test', year: 2024, numberPages: 1000}" +
                ", title: 'Test', author: 'Test', year: 2024, numberPages: 1000}" +
                ", title: 'Test', author: 'Test', year: 2024, numberPages: 1000}]";

        Assertions.assertEquals(expectedLib, lib.printLib());
    }
}
