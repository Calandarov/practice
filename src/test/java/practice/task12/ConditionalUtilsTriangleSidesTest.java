package practice.task12;

import org.junit.Assert;
import org.junit.Test;

public class ConditionalUtilsTriangleSidesTest {
    @Test
    public void isTriangleSides() {
        Assert.assertTrue(ConditionalUtilsTriangleSides.isTriangleSides(10,7,12));
        Assert.assertTrue(ConditionalUtilsTriangleSides.isTriangleSides(5,7,10));
    }

    @Test
    public void isNotTriangleSides() {
        Assert.assertFalse(ConditionalUtilsTriangleSides.isTriangleSides(1,2,3));
        Assert.assertFalse(ConditionalUtilsTriangleSides.isTriangleSides(3,4,8));
    }
}
