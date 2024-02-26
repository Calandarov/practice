package practice.task36.subtask2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class LibTest {
    Book book1 = new Book("Book1", "Author1", 2023, 1000);
    Book book2 = new Book("Book2", "Author2", 2024, 1500);
    Book book3 = new Book("Book3", "Author1", 2024, 1500);
    Lib lib = new Lib();

    @Test
    public void addBook() {
        Assert.assertTrue(lib.addBook(book1));
        Assert.assertTrue(lib.addBook(book2));
        Assert.assertEquals(2, lib.getBooks().size());
    }

    @Test
    public void deleteBook() {
        lib.addBook(book1);
        lib.addBook(book2);

        Assert.assertTrue(lib.deleteBook(book1));
        Assert.assertEquals(1, lib.getBooks().size());
    }

    // TODO: переделать
    @Test
    public void printBooks() {
        lib.addBook(book1);
        lib.addBook(book2);

        String expectedBooks = "[title='Book1', author='Author1', year=2023, price=1000, title='Book2', author='Author2', year=2024, price=1500]";
        Assert.assertEquals(expectedBooks, lib.printBooks());
    }

    // TODO: переделать
    @Test
    public void findBookByAuthor() {
        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);

        ArrayList<Book> actualBooks = lib.findBookByAuthor("Author1");

        Assert.assertEquals(2, actualBooks.size());
        for(Book book : actualBooks) {
            Assert.assertEquals("Author1", book.getAuthor());
        }
    }

    // TODO: переделать
    @Test
    public void findBookByYear() {
        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);

        ArrayList<Book> actualBooks = lib.findBookByYear(2024);

        Assert.assertEquals(2, actualBooks.size());
        for(Book book : actualBooks) {
            Assert.assertEquals(2024, book.getYear());
        }

    }
}
