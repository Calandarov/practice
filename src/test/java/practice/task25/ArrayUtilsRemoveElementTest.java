package practice.task25;

import org.junit.Assert;
import org.junit.Test;

public class ArrayUtilsRemoveElementTest {
    @Test
    public void removeElement() {
        int[] nums = new int[] {1, 1, 2, 3, 1};
        int[] actualArr = ArrayUtilsRemoveElement.removeElement(nums, 1);
        int[] expectedArr = new int[] {2, 3};

        Assert.assertArrayEquals(expectedArr, actualArr);
    }
}
