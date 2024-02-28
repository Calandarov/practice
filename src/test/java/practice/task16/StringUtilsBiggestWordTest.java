package practice.task16;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StringUtilsBiggestWordTest {
    @Test
    public void getLargest() {
        Assertions.assertEquals("большое", StringUtilsBiggestWord.getBiggestWord("самое большое слово"));
        Assertions.assertEquals("словооо", StringUtilsBiggestWord.getBiggestWord("самое большое словооо"));
        Assertions.assertEquals("самоееее", StringUtilsBiggestWord.getBiggestWord("самоееее большое словооо"));
    }
}
