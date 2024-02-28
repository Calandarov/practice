package practice.task31.subtask3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ChairTest {
    @Test
    public void createObject() {
        Chair chair = new Chair(10, 20, 30, 1000, "TestManufacturer", 2024);

        System.out.println(chair.calculateSize());
    }
}
