package practice.task29.subtask2;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    Triangle triangle;
    @Test
    public void createObjectUsingNoArgConstructor() {
        triangle = new Triangle();

        Assert.assertEquals("a=(0,0), b=(0,0), c=(0,0)", triangle.getCoordinates());
    }

    @Test
    public void createObjectUsingSixArgConstructor() {
        triangle = new Triangle(1, 1, 2, 2,3, 1);

        Assert.assertEquals("a=(1,1), b=(2,2), c=(3,1)", triangle.getCoordinates());
    }
}
