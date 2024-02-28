package practice.task29.subtask1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RectTest {
    Rect rect;

    @Test
    public void createObjectUsingNoArgConstructor() {
        rect = new Rect();

        Assertions.assertEquals("(0,0;0,0)", rect.getCoordinates());
    }

    @Test
    public void createObjectUsingFourArgConstructor() {
        rect = new Rect(1, 1, 3, 3);

        Assertions.assertEquals("(1,1;3,3)", rect.getCoordinates());
    }
}
