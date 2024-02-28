package practice.task9;

import org.junit.Assert;
import org.junit.Test;

public class ConditionalUtilsTwiceEvenTest {
    @Test
    public void isTwiceEven() {
        Assert.assertTrue(ConditionalUtilsTwiceEven.isTwiceEven(123));
        Assert.assertTrue(ConditionalUtilsTwiceEven.isTwiceEven(222));
    }

    @Test
    public void isNotTwiceEven() {
        Assert.assertFalse(ConditionalUtilsTwiceEven.isTwiceEven(999));
        Assert.assertFalse(ConditionalUtilsTwiceEven.isTwiceEven(555));
    }

    @Test
    public void numberLengthIsNotEqualTwo() {
        Assert.assertFalse(ConditionalUtilsTwiceEven.isTwiceEven(22));
        Assert.assertFalse(ConditionalUtilsTwiceEven.isTwiceEven(2222));
    }
}
