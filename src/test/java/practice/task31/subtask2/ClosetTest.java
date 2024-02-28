package practice.task31.subtask2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ClosetTest {
    Closet closet1 = new Closet(10, 20, 30, "Test1", 2500, "TestManufacturer1", 2023);
    Closet closet2 = new Closet(20, 30, 40, "Test2", 15000, "TestManufacturer2", 2024);

    @Test
    public void getDimensions() {
        Assertions.assertEquals(10, closet1.getWidth());
        Assertions.assertEquals(20, closet1.getHeight());
        Assertions.assertEquals(30, closet1.getLength());

        Assertions.assertEquals(20, closet2.getWidth());
        Assertions.assertEquals(30, closet2.getHeight());
        Assertions.assertEquals(40, closet2.getLength());
    }

    @Test
    public void calculateSize() {
        Assertions.assertEquals(6000, closet1.calculateSize());
        Assertions.assertEquals(24000, closet2.calculateSize());
    }
}
