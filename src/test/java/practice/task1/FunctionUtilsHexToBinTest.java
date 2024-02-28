package practice.task1;

import org.junit.Assert;
import org.junit.Test;

public class FunctionUtilsHexToBinTest {
    @Test
    public void convertHexToBin() {
        Assert.assertEquals("10111", FunctionUtilsHexToBin.hexToBin("17"));
        Assert.assertEquals("10000", FunctionUtilsHexToBin.hexToBin("10"));
        Assert.assertEquals("100011", FunctionUtilsHexToBin.hexToBin("23"));
    }
}
