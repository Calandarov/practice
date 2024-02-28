package practice.task7;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MathUtilArrayTest {
    @Test
    public void getEvenNumbersUpTo() {
        Assertions.assertEquals("1: ", MathUtilArray.getEvenNumbersUpTo((byte) 1));
        Assertions.assertEquals("12: 2", MathUtilArray.getEvenNumbersUpTo((byte) 2));
        Assertions.assertEquals("12345: 24", MathUtilArray.getEvenNumbersUpTo((byte) 5));
        Assertions.assertEquals("12345678910: 246810", MathUtilArray.getEvenNumbersUpTo((byte) 10));

        Assertions.assertEquals("", MathUtilArray.getEvenNumbersUpTo((byte) -1));
        Assertions.assertEquals("1", MathUtilArray.getEvenNumbersUpTo((byte) 0));

    }
}
