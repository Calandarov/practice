package practice.task13;

import org.junit.Assert;
import org.junit.Test;

public class RepeatTest {
    @Test
    public void lengthIsGreaterZero() {
        Assert.assertArrayEquals(new int[] {1}, Repeat.generateArr(1));
        Assert.assertArrayEquals(new int[] {1, 2}, Repeat.generateArr(2));
        Assert.assertArrayEquals(new int[] {1, 2, 3, 5, 8, 13, 21, 34, 55}, Repeat.generateArr(9));
    }

    @Test
    public void lengthIsLessOrEqualZero() {
        Assert.assertArrayEquals(new int[0], Repeat.generateArr(-1));
        Assert.assertArrayEquals(new int[0], Repeat.generateArr(0));
    }
}
