package practice.task14;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StringUtilsCamelTest {
    @Test
    public void convertStringToCamelCase() {
        Assertions.assertEquals("myCamelCaseString", StringUtilsCamel.toCamelCase("my camel * case string 1"));
        Assertions.assertEquals("myCamelCaseString", StringUtilsCamel.toCamelCase("@1 my camel * case string 1"));
    }
}
