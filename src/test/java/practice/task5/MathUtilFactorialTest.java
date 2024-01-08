package practice.task5;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilFactorialTest {
    @Test
    public void getFactorial() {
        Assert.assertEquals(6, MathUtilFactorial.getFactorial((byte) 3));
        Assert.assertEquals(120, MathUtilFactorial.getFactorial((byte) 5));

        Assert.assertEquals(0, MathUtilFactorial.getFactorial((byte) 1000));

        Assert.assertEquals(0, MathUtilFactorial.getFactorial((byte) -3));
        Assert.assertEquals(1, MathUtilFactorial.getFactorial((byte) 0));
    }
}
