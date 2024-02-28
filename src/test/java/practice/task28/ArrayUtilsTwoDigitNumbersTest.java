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

        for(int item : actualArray) {
            if (item < 10 || item > 99) {
                isPositiveTwoDigitNum = false;
                break;
            }
        }

        Assert.assertEquals(expectedArrayLength, actualArray.length);
        Assert.assertTrue(isPositiveTwoDigitNum);
    }
}
