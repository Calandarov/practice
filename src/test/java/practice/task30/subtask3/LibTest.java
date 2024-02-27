package practice.task30.subtask3;

import org.junit.Test;


public class LibTest {
    @Test
    public void test() {
        Lib lib = new Lib();

        Book book = new Book();
        book.setTitle("TestQ");
        book.setAuthor("TestQ");
        book.setYear(2000);
        book.setNumberPages(3000);

        lib.addBook(book);
        System.out.println(lib.getLib().length);

        lib.deleteBook(book);
        System.out.println(lib.getLib().length);

        for(Book item : lib.getLib()) {
            System.out.println(item.toString());
        }
    }
}
