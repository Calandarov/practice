package practice.task9;

import org.junit.Assert;
import org.junit.Test;

public class ConditionalUtilsTwiceEvenTest {
    @Test
    public void isDoublePrime() {
        Assert.assertTrue(ConditionalUtilsTwiceEven.isDoublePrime(123));
        Assert.assertTrue(ConditionalUtilsTwiceEven.isDoublePrime(222));

        Assert.assertFalse(ConditionalUtilsTwiceEven.isDoublePrime(22));
        Assert.assertFalse(ConditionalUtilsTwiceEven.isDoublePrime(2222));
        Assert.assertFalse(ConditionalUtilsTwiceEven.isDoublePrime(555));
    }
}
