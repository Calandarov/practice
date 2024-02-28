package practice.task29.subtask1;

import org.junit.Assert;
import org.junit.Test;

public class RectTest {
    Rect rect;

    @Test
    public void createObjectUsingNoArgConstructor() {
        rect = new Rect();

        Assert.assertEquals("(0,0;0,0)", rect.getCoordinates());
    }

    @Test
    public void createObjectUsingFourArgConstructor() {
        rect = new Rect(1, 1, 3, 3);

        Assert.assertEquals("(1,1;3,3)", rect.getCoordinates());
    }
}
