package practice.task31.subtask3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ChairTest {
    Chair chair1 = new Chair(10, 20, 30, 1000, "TestManufacturer1", 2024);
    Chair chair2 = new Chair(5, 15, 25, 1000, "TestManufacturer2", 2020);

    @Test
    public void getDimensions() {
        Assertions.assertEquals(10, chair1.getWidth());
        Assertions.assertEquals(20, chair1.getHeight());
        Assertions.assertEquals(30, chair1.getLength());

        Assertions.assertEquals(5, chair2.getWidth());
        Assertions.assertEquals(15, chair2.getHeight());
        Assertions.assertEquals(25, chair2.getLength());
    }

    @Test
    public void calculateSize() {
        Assertions.assertEquals(6000, chair1.calculateSize());
        Assertions.assertEquals(1875, chair2.calculateSize());
    }
}
