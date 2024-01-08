package practice.task11;

import org.junit.Assert;
import org.junit.Test;

public class ConditionalUtilsFlatNumberTest {
    @Test
    public void isDescendingNumber() {
        Assert.assertTrue(ConditionalUtilsFlatNumber.isDescendingNumber(111));
        Assert.assertTrue(ConditionalUtilsFlatNumber.isDescendingNumber(555));
        Assert.assertTrue(ConditionalUtilsFlatNumber.isDescendingNumber(999));

        Assert.assertFalse(ConditionalUtilsFlatNumber.isDescendingNumber(1));
        Assert.assertFalse(ConditionalUtilsFlatNumber.isDescendingNumber(1111));
        Assert.assertFalse(ConditionalUtilsFlatNumber.isDescendingNumber(110));
    }
}
