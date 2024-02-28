package practice.task16;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsBiggestWordTest {
    @Test
    public void getLargest() {
        Assert.assertEquals("большое", StringUtilsBiggestWord.getBiggestWord("самое большое слово"));
        Assert.assertEquals("словооо", StringUtilsBiggestWord.getBiggestWord("самое большое словооо"));
        Assert.assertEquals("самоееее", StringUtilsBiggestWord.getBiggestWord("самоееее большое словооо"));
    }
}
