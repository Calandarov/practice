package practice.task17;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StringUtilsSliceWordTest {
    @Test
    public void getSlice() {
        Assertions.assertEquals("Tes", StringUtilsSliceWord.getSlice("Test", 0, 3));
        Assertions.assertEquals("est", StringUtilsSliceWord.getSlice("Test", 1, 4));
        Assertions.assertEquals("Test", StringUtilsSliceWord.getSlice("Test ", 0, 4));
    }
}
