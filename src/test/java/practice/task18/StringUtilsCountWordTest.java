package practice.task18;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsCountWordTest {
    @Test
    public void countWord() {
        Assert.assertEquals(1, StringUtilsCountWord.countWord("Test str for test", "str"));
        Assert.assertEquals(2, StringUtilsCountWord.countWord("Test str for test", "test"));
        Assert.assertEquals(0, StringUtilsCountWord.countWord("Test str for test", "qwe"));
    }
}
