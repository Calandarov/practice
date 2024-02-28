package practice.task21;


import org.junit.Assert;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

public class CollectionUtilsCountTest {
    @Test
    public void countElements() {
        String[] inputArr = {"1", "2", "4", "1", "1", "1", "2", "3", "2"};
        Map<String, Integer> actualMap = new HashMap<>(CollectionUtilsCount.countElements(inputArr));
        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("1", 4);
        expectedMap.put("2", 3);
        expectedMap.put("3", 1);
        expectedMap.put("4", 1);

        Assert.assertEquals(expectedMap, actualMap);
    }
}
