package practice.task10;

import org.junit.Assert;
import org.junit.Test;

public class ConditionalUtilsLeapYearTest {
    @Test
    public void isLeapYear() {
        Assert.assertTrue(ConditionalUtilsLeapYear.isLeapYear(2000));
        Assert.assertTrue(ConditionalUtilsLeapYear.isLeapYear(2024));

        Assert.assertFalse(ConditionalUtilsLeapYear.isLeapYear(1999));
        Assert.assertFalse(ConditionalUtilsLeapYear.isLeapYear(2023));
    }
}
