package practice.task9;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ConditionalUtilsTwiceEvenTest {
    @Test
    public void isTwiceEven() {
        Assertions.assertTrue(ConditionalUtilsTwiceEven.isTwiceEven(123));
        Assertions.assertTrue(ConditionalUtilsTwiceEven.isTwiceEven(222));
    }

    @Test
    public void isNotTwiceEven() {
        Assertions.assertFalse(ConditionalUtilsTwiceEven.isTwiceEven(999));
        Assertions.assertFalse(ConditionalUtilsTwiceEven.isTwiceEven(555));
    }

    @Test
    public void numberLengthIsNotEqualTwo() {
        Assertions.assertFalse(ConditionalUtilsTwiceEven.isTwiceEven(22));
        Assertions.assertFalse(ConditionalUtilsTwiceEven.isTwiceEven(2222));
    }
}
