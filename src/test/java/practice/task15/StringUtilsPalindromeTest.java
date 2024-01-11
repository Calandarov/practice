package practice.task15;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsPalindromeTest {
    @Test
    public void isPalindrome() {
        Assert.assertTrue(StringUtilsPalindrome.isPalindrome("шалаш"));
        Assert.assertTrue(StringUtilsPalindrome.isPalindrome("Лёша на полке клопа нашёл"));
        Assert.assertTrue(StringUtilsPalindrome.isPalindrome("!@$ша,ла2;%4ш0"));
        Assert.assertTrue(StringUtilsPalindrome.isPalindrome("level"));

        Assert.assertFalse(StringUtilsPalindrome.isPalindrome("!@^&"));
        Assert.assertFalse(StringUtilsPalindrome.isPalindrome("дом"));
    }
}
