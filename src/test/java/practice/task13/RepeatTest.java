package practice.task13;

import org.junit.Assert;
import org.junit.Test;

public class RepeatTest {
    @Test
    public void generateArrWithFibonachi() {
        Assert.assertArrayEquals(new int[] {1, 2, 3}, Repeat.generateArrWithFibonachi(3));
        Assert.assertArrayEquals(new int[] {1, 2, 3, 5}, Repeat.generateArrWithFibonachi(4));
        Assert.assertArrayEquals(new int[] {1, 2, 3, 5, 8, 13, 21, 34, 55}, Repeat.generateArrWithFibonachi(9));
    }
}
