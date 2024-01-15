package practice.task25;

import org.junit.Test;

public class ArrayUtilsRemoveElementTest {
    @Test
    public void removeElement() {
        int[] nums = new int[] {1, 1, 2, 3, 1};

        ArrayUtilsRemoveElement.removeElement(nums, 1);
    }
}
