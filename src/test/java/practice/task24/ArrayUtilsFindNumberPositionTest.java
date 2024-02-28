package practice.task24;

import org.junit.Assert;
import org.junit.Test;

public class ArrayUtilsFindNumberPositionTest {
    int[][] inputArr = new int[][] {{5,7,3,17}, {7,0,1,12}};
    @Test
    public void numberFound() {
        int[] actualNonEmptyArr = ArrayUtilsFindNumberPosition.findNumberPosition(inputArr, 7);
        int[] expectedNonEmptyArr = new int[] {1, 0};

        Assert.assertArrayEquals(expectedNonEmptyArr, actualNonEmptyArr);
    }

    @Test
    public void numberNotFound() {
        int[] actualEmptyArr = ArrayUtilsFindNumberPosition.findNumberPosition(inputArr, 9);
        int[] expectedEmptyArr = new int[0];

        Assert.assertArrayEquals(expectedEmptyArr, actualEmptyArr);
    }
}
