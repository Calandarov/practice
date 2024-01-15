package practice.task24;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ArrayUtilsFindNumberPositionTest {
    @Test
    public void findNumberPosition() {
        int[][] input = new int[][] {{5,7,3,17}, {7,0,1,12}};

        int[] actualNonEmptyArr = ArrayUtilsFindNumberPosition.findNumberPosition(input, 7);
        int[] expectedNonEmptyArr = new int[] {1, 0};

        int[] actualEmptyArr = ArrayUtilsFindNumberPosition.findNumberPosition(input, 9);
        int[] expectedEmptyArr = new int[0];

        Assert.assertArrayEquals(expectedNonEmptyArr, actualNonEmptyArr);
        Assert.assertArrayEquals(expectedEmptyArr, actualEmptyArr);
    }
}
