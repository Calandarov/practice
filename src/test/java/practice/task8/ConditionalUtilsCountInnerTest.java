package practice.task8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ConditionalUtilsCountInnerTest {
    @Test
    public void countInnerNumber() {
        Assertions.assertEquals(0, ConditionalUtilsCountInner.countInnerNumber(6522, 11));
        Assertions.assertEquals(1, ConditionalUtilsCountInner.countInnerNumber(6522, 22));
        Assertions.assertEquals(2, ConditionalUtilsCountInner.countInnerNumber(6222, 22));
        Assertions.assertEquals(3, ConditionalUtilsCountInner.countInnerNumber(2222, 22));
    }
}
