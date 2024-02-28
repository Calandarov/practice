package practice.task10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ConditionalUtilsLeapYearTest {
    @Test
    public void isLeapYear() {
        Assertions.assertTrue(ConditionalUtilsLeapYear.isLeapYear(2000));
        Assertions.assertTrue(ConditionalUtilsLeapYear.isLeapYear(2024));
    }

    @Test
    public void isNotLeapYear() {
        Assertions.assertFalse(ConditionalUtilsLeapYear.isLeapYear(1999));
        Assertions.assertFalse(ConditionalUtilsLeapYear.isLeapYear(2023));
    }
}
