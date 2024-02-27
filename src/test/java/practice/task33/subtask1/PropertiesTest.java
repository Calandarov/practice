package practice.task33.subtask1;

import org.junit.Test;

public class PropertiesTest {
    @Test
    public void createObject() {
        Properties properties = new Properties(10, "straight", 255, 255, 255);

        System.out.println(properties.lineWidth);
        System.out.println(properties.lineType);
        System.out.println(properties.color);
    }
}
