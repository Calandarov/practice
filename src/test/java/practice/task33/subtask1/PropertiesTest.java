package practice.task33.subtask1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PropertiesTest {
    @Test
    public void createObject() {
        Properties properties = new Properties(10, "straight", 255, 255, 255);

        System.out.println(properties.getLineWidth());
        System.out.println(properties.getLineType());
        System.out.println(properties.getColor());
    }
}
