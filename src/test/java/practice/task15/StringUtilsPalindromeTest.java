package practice.task15;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StringUtilsPalindromeTest {
    @Test
    public void isPalindrome() {
        Assertions.assertTrue(StringUtilsPalindrome.isPalindrome("шалаш"));
        Assertions.assertTrue(StringUtilsPalindrome.isPalindrome("Лёша на полке клопа нашёл"));
        Assertions.assertTrue(StringUtilsPalindrome.isPalindrome("!@$ша,ла2;%4ш0"));
        Assertions.assertTrue(StringUtilsPalindrome.isPalindrome("level"));
    }

    @Test
    public void isNotPalindrome() {
        Assertions.assertFalse(StringUtilsPalindrome.isPalindrome("!@#$%^&*()_-"));
        Assertions.assertFalse(StringUtilsPalindrome.isPalindrome("дом"));
    }
}
