package practice.task16;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsBiggestWordTest {
    @Test
    public void getLargest() {
        Assert.assertEquals("большое", StringUtilsBiggestWord.getLargest("самое большое слово"));
        Assert.assertEquals("словооо", StringUtilsBiggestWord.getLargest("самое большое словооо"));
        Assert.assertEquals("самоееее", StringUtilsBiggestWord.getLargest("самоееее большое словооо"));
    }

}
