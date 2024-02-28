package practice.task2;

import org.junit.Assert;
import org.junit.Test;

public class WordUtilsTest {
    @Test
    public void reverseWords() {
        Assert.assertEquals("asd zxc", WordUtils.reverseWords("zxc asd"));
        Assert.assertEquals("qwe asd zxc", WordUtils.reverseWords("zxc asd qwe"));

        Assert.assertEquals("asd", WordUtils.reverseWords("asd"));
        Assert.assertEquals("", WordUtils.reverseWords(""));
    }
}
