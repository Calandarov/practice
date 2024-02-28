package practice.task31.subtask2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ClosetTest {
    @Test
    public void createObject() {
        Closet closet1 = new Closet(10, 20, 30, "Test1", 2500, "TestManufacturer1", 2023);
        Closet closet2 = new Closet(100, 200, 300, "Test2", 15000, "TestManufacturer2", 2024);

        System.out.println(closet1.getWidth());
        System.out.println(closet1.getHeight());
        System.out.println(closet1.getLength());
        System.out.println(closet1.calculateSize());

        System.out.println(closet2.getWidth());
        System.out.println(closet2.getHeight());
        System.out.println(closet2.getLength());
        System.out.println(closet2.calculateSize());
    }

}
