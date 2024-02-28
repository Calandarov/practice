package practice.task2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class WordUtilsTest {
    @Test
    public void reverseWords() {
        Assertions.assertEquals("asd zxc", WordUtils.reverseWords("zxc asd"));
        Assertions.assertEquals("qwe asd zxc", WordUtils.reverseWords("zxc asd qwe"));

        Assertions.assertEquals("asd", WordUtils.reverseWords("asd"));
        Assertions.assertEquals("", WordUtils.reverseWords(""));
    }
}
