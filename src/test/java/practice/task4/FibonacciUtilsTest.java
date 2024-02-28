package practice.task4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FibonacciUtilsTest {
    @Test
    public void getFibonacciSum() {
        Assertions.assertEquals("1", FibonacciUtils.getFibonacciSum((byte) 2));
        Assertions.assertEquals("7", FibonacciUtils.getFibonacciSum((byte) 5));
        Assertions.assertEquals("33", FibonacciUtils.getFibonacciSum((byte) 8));
        Assertions.assertEquals("88", FibonacciUtils.getFibonacciSum((byte) 10));

        Assertions.assertEquals("0", FibonacciUtils.getFibonacciSum((byte) -1));
    }
}
