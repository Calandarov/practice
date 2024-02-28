package practice.task11;

import org.junit.Assert;
import org.junit.Test;

public class ConditionalUtilsFlatNumberTest {
    @Test
    public void isFlatNumber() {
        Assert.assertTrue(ConditionalUtilsFlatNumber.isFlatNumber(111));
        Assert.assertTrue(ConditionalUtilsFlatNumber.isFlatNumber(999));
    }

    @Test
    public void isNotFlatNumber() {
        Assert.assertFalse(ConditionalUtilsFlatNumber.isFlatNumber(110));
        Assert.assertFalse(ConditionalUtilsFlatNumber.isFlatNumber(123));
    }

    @Test
    public void numberLengthIsNotEqualThree() {
        Assert.assertFalse(ConditionalUtilsFlatNumber.isFlatNumber(1));
        Assert.assertFalse(ConditionalUtilsFlatNumber.isFlatNumber(1111));
    }
}
