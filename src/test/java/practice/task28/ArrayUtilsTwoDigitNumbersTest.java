package practice.task28;

import org.junit.Assert;
import org.junit.Test;

public class ArrayUtilsTwoDigitNumbersTest {
    @Test
    public void fillArrayByTwoDigitNumbers() {
        int[] inputArray = new int[5];
        int[] actualArray = ArrayUtilsTwoDigitNumbers.fillArrayByTwoDigitNumbers(inputArray);
        int expectedArrayLength = inputArray.length;
        boolean isPositiveTwoDigitNum = true;

        for(int i : actualArray) {
            if (i < 10 || i > 99) {
                isPositiveTwoDigitNum = false;
                break;
            }
        }

        Assert.assertEquals(expectedArrayLength, actualArray.length);
        Assert.assertTrue(isPositiveTwoDigitNum);
    }
}
