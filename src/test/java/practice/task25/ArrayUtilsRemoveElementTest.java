package practice.task25;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ArrayUtilsRemoveElementTest {
    @Test
    public void removeElement() {
        int[] nums = new int[] {1, 1, 2, 3, 1};
        int[] actualArr = ArrayUtilsRemoveElement.removeElement(nums, 1);
        int[] expectedArr = new int[] {2, 3};

        Assertions.assertArrayEquals(expectedArr, actualArr);
    }
}
