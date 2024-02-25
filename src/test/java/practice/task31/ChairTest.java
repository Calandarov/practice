package practice.task31;

import org.junit.Test;

public class ChairTest {
    @Test
    public void createObject() {
        Chair chair = new Chair(10, 20, 30, 1000, "TestMabufacturer", 2024);

        System.out.println(chair.calculateSize());
    }
}
