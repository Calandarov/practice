package practice.task23;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CollectionUtilsInvertMapTest {
    @Test
    public void invertMap() {
        Map<String, Integer> expectedMap = Map.of("a", 1, "b", 2, "c", 3);
        Map<String, Integer> actualMap = CollectionUtilsInvertMap.invertMap(Map.of(1, "a", 2, "b", 3, "c"));

        Assert.assertEquals(expectedMap, actualMap);
    }
}
