package practice.task11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ConditionalUtilsFlatNumberTest {
    @Test
    public void isFlatNumber() {
        Assertions.assertTrue(ConditionalUtilsFlatNumber.isFlatNumber(111));
        Assertions.assertTrue(ConditionalUtilsFlatNumber.isFlatNumber(999));
    }

    @Test
    public void isNotFlatNumber() {
        Assertions.assertFalse(ConditionalUtilsFlatNumber.isFlatNumber(110));
        Assertions.assertFalse(ConditionalUtilsFlatNumber.isFlatNumber(123));
    }

    @Test
    public void numberLengthIsNotEqualThree() {
        Assertions.assertFalse(ConditionalUtilsFlatNumber.isFlatNumber(1));
        Assertions.assertFalse(ConditionalUtilsFlatNumber.isFlatNumber(1111));
    }
}
