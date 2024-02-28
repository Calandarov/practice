package practice.task14;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsCamelTest {
    @Test
    public void convertStringToCamelCase() {
        Assert.assertEquals("myCamelCaseString", StringUtilsCamel.toCamelCase("my camel * case string 1"));
        Assert.assertEquals("myCamelCaseString", StringUtilsCamel.toCamelCase("@1 my camel * case string 1"));
    }
}
