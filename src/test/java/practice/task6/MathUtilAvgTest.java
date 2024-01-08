package practice.task6;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilAvgTest {
    @Test
    public void getPrimeNumbersSum() {
        Assert.assertEquals(6, MathUtilAvg.getPrimeNumbersSum((byte) 1, (byte) 10));
        Assert.assertEquals(64, MathUtilAvg.getPrimeNumbersSum((byte) 1, (byte) 127));

        Assert.assertEquals(0, MathUtilAvg.getPrimeNumbersSum((byte) -1, (byte) 1));
        Assert.assertEquals(0, MathUtilAvg.getPrimeNumbersSum((byte) 1, (byte) -1));
        Assert.assertEquals(0, MathUtilAvg.getPrimeNumbersSum((byte) 1, (byte) 0));
    }
}
