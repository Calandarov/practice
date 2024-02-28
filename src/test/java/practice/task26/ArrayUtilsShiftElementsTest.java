package practice.task26;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ArrayUtilsShiftElementsTest {
    @Test
    public void shiftElements() {
        int[] inputArray = new int[] {1, 2, 3, 4, 5};
        int[] actualArray = ArrayUtilsShiftElements.shiftElements(inputArray);
        int[] expectedArray = new int[] {2, 3, 4, 5, 1};

        Assertions.assertArrayEquals(expectedArray, actualArray);
    }
}
