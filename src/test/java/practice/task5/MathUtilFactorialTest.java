package practice.task5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MathUtilFactorialTest {
    @Test
    public void getFactorial() {
        Assertions.assertEquals(6, MathUtilFactorial.getFactorial((byte) 3));
        Assertions.assertEquals(120, MathUtilFactorial.getFactorial((byte) 5));
        Assertions.assertEquals(1, MathUtilFactorial.getFactorial((byte) 0));
        Assertions.assertEquals(0, MathUtilFactorial.getFactorial((byte) 1000));
        Assertions.assertEquals(0, MathUtilFactorial.getFactorial((byte) -3));
    }
}
