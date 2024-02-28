package practice.task18;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StringUtilsCountWordTest {
    @Test
    public void countWord() {
        Assertions.assertEquals(1, StringUtilsCountWord.countWord("Test str for test", "str"));
        Assertions.assertEquals(2, StringUtilsCountWord.countWord("Test str for test", "test"));
        Assertions.assertEquals(0, StringUtilsCountWord.countWord("Test str for test", "qwe"));
    }
}
