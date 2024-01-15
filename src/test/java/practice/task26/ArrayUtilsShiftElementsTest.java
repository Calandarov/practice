package practice.task26;

import org.junit.Assert;
import org.junit.Test;

public class ArrayUtilsShiftElementsTest {
    @Test
    public void shiftElements() {
        int[] inputArray = new int[] {1, 2, 3, 4, 5};
        int[] actualArray = ArrayUtilsShiftElements.shiftElements(inputArray);
        int[] expectedArray = new int[] {2, 3, 4, 5, 1};

        Assert.assertArrayEquals(expectedArray, actualArray);
    }
}
