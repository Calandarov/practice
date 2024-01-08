package practice.task7;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilArrayTest {
    @Test
    public void getEvenNumbersUpTo() {
        Assert.assertEquals("1: ", MathUtilArray.getEvenNumbersUpTo((byte) 1));
        Assert.assertEquals("12: 2", MathUtilArray.getEvenNumbersUpTo((byte) 2));
        Assert.assertEquals("12345: 24", MathUtilArray.getEvenNumbersUpTo((byte) 5));
        Assert.assertEquals("12345678910: 246810", MathUtilArray.getEvenNumbersUpTo((byte) 10));

        Assert.assertEquals("", MathUtilArray.getEvenNumbersUpTo((byte) -1));
        Assert.assertEquals("1", MathUtilArray.getEvenNumbersUpTo((byte) 0));

    }
}
