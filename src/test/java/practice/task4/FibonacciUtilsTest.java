package practice.task4;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciUtilsTest {
    @Test
    public void getFibonacciSum() {
        Assert.assertEquals("1", FibonacciUtils.getFibonacciSum((byte) 2));
        Assert.assertEquals("7", FibonacciUtils.getFibonacciSum((byte) 5));
        Assert.assertEquals("33", FibonacciUtils.getFibonacciSum((byte) 8));
        Assert.assertEquals("88", FibonacciUtils.getFibonacciSum((byte) 10));

        Assert.assertEquals("0", FibonacciUtils.getFibonacciSum((byte) -1));
    }
}
