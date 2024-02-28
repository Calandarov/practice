package practice.task6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MathUtilAvgTest {
    @Test
    public void getPrimeNumbersSum() {
        Assertions.assertEquals(6, MathUtilAvg.getPrimeNumbersSum((byte) 1, (byte) 10));
        Assertions.assertEquals(64, MathUtilAvg.getPrimeNumbersSum((byte) 1, (byte) 127));

        Assertions.assertEquals(0, MathUtilAvg.getPrimeNumbersSum((byte) -1, (byte) 1));
        Assertions.assertEquals(0, MathUtilAvg.getPrimeNumbersSum((byte) 1, (byte) -1));
        Assertions.assertEquals(0, MathUtilAvg.getPrimeNumbersSum((byte) 1, (byte) 0));
    }
}
