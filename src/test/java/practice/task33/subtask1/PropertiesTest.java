package practice.task33.subtask1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PropertiesTest {
    @Test
    public void getColor() {
        Properties properties1 = new Properties(10, "straight", 255, 255, 255);
        Properties properties2 = new Properties(10, "straight", 0, 0, 0);

        Assertions.assertEquals("red=255, green=255, blue=255", properties1.getColor().toString());
        Assertions.assertEquals("red=0, green=0, blue=0", properties2.getColor().toString());
    }
}
