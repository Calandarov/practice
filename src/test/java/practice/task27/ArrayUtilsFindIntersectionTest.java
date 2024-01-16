package practice.task27;

import org.junit.Assert;
import org.junit.Test;

public class ArrayUtilsFindIntersectionTest {
    @Test
    public void findIntersection() {
        int[] rightArray1 = new int[] {1,4,7,3,8};
        int[] leftArray1 = new int[] {9,12,7,4};
        int[] actualNonEmptyArray = ArrayUtilsFindIntersection.findIntersection(rightArray1, leftArray1);
        int[] expectedNonEmptyArray = new int[] {4, 7};

        int[] rightArray2 = new int[] {1,4,7,3,8};
        int[] leftArray2 = new int[] {9,12,0,5};
        int[] actualEmptyArray = ArrayUtilsFindIntersection.findIntersection(rightArray2, leftArray2);
        int[] expectedEmptyArray = new int[0];

        Assert.assertArrayEquals(expectedNonEmptyArray, actualNonEmptyArray);
        Assert.assertArrayEquals(expectedEmptyArray, actualEmptyArray);

    }
}
