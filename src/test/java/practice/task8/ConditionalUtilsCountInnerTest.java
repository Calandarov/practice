package practice.task8;

import org.junit.Assert;
import org.junit.Test;

public class ConditionalUtilsCountInnerTest {
    @Test
    public void countInnerNumber() {
        Assert.assertEquals(0, ConditionalUtilsCountInner.countInnerNumber(6522, 11));
        Assert.assertEquals(1, ConditionalUtilsCountInner.countInnerNumber(6522, 22));
        Assert.assertEquals(2, ConditionalUtilsCountInner.countInnerNumber(6222, 22));
        Assert.assertEquals(3, ConditionalUtilsCountInner.countInnerNumber(2222, 22));
    }
}
