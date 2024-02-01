package practice.task30;

import org.junit.Test;

import java.util.Arrays;

public class LibTest {
    @Test
    public void test() {
        Lib lib1 = new Lib();

        Book book1 = new Book();
        book1.setTitle("TestQ");
        book1.setAuthor("TestQ");
        book1.setYear(2000);
        book1.setNumberPages(3000);

        Book book2 = new Book();
        book2.setTitle("TestQ");
        book2.setAuthor("TestQ");
        book2.setYear(2000);
        book2.setNumberPages(3000);



        lib1.addBook(book1);
        lib1.addBook(new Book());
        lib1.addBook(new Book());
        lib1.addBook(new Book());
        lib1.addBook(new Book());
        System.out.println(Arrays.toString(lib1.getLib()));


//        lib1.deleteBook(book2);

        System.out.println(Arrays.toString(lib1.getLib()));
    }
}
