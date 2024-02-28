package practice.task1;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FunctionUtilsHexToBinTest {
    @Test
    public void convertHexToBin() {
        Assertions.assertEquals("10111", FunctionUtilsHexToBin.hexToBin("17"));
        Assertions.assertEquals("10000", FunctionUtilsHexToBin.hexToBin("10"));
        Assertions.assertEquals("100011", FunctionUtilsHexToBin.hexToBin("23"));
    }
}
