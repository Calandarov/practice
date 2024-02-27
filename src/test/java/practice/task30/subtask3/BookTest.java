package practice.task30.subtask3;

import org.junit.Test;

public class BookTest {
    @Test
    public void equals() {
        Book book1 = new Book();
        Book book2 = new Book();

        System.out.println(book1.equals(book2));
    }
}
