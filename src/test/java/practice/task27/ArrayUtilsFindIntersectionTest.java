package practice.task27;

import org.junit.Assert;
import org.junit.Test;

public class ArrayUtilsFindIntersectionTest {
    @Test
    public void intersectionFound() {
        int[] rightArray = new int[] {1,4,7,3,8};
        int[] leftArray = new int[] {9,12,7,4};

        int[] actualNonEmptyArray = ArrayUtilsFindIntersection.findIntersection(rightArray, leftArray);
        int[] expectedNonEmptyArray = new int[] {4, 7};
        
        Assert.assertArrayEquals(expectedNonEmptyArray, actualNonEmptyArray);
    }

    @Test
    public void intersectionNotFound() {
        int[] rightArray = new int[] {1,4,7,3,8};
        int[] leftArray = new int[] {9,12,0,5};

        int[] actualEmptyArray = ArrayUtilsFindIntersection.findIntersection(rightArray, leftArray);
        int[] expectedEmptyArray = new int[0];

        Assert.assertArrayEquals(expectedEmptyArray, actualEmptyArray);
    }
}
