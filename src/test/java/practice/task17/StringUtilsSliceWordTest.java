package practice.task17;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsSliceWordTest {
    @Test
    public void getSlice() {
        Assert.assertEquals("Tes", StringUtilsSliceWord.getSlice("Test", 0, 3));
        Assert.assertEquals("est", StringUtilsSliceWord.getSlice("Test", 1, 4));
        Assert.assertEquals("Test", StringUtilsSliceWord.getSlice("Test ", 0, 4));
    }
}
