package practice.task13;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RepeatTest {
    @Test
    public void lengthIsGreaterZero() {
        Assertions.assertArrayEquals(new int[] {1}, Repeat.generateArr(1));
        Assertions.assertArrayEquals(new int[] {1, 2}, Repeat.generateArr(2));
        Assertions.assertArrayEquals(new int[] {1, 2, 3, 5, 8, 13, 21, 34, 55}, Repeat.generateArr(9));
    }

    @Test
    public void lengthIsLessOrEqualZero() {
        Assertions.assertArrayEquals(new int[0], Repeat.generateArr(-1));
        Assertions.assertArrayEquals(new int[0], Repeat.generateArr(0));
    }
}
