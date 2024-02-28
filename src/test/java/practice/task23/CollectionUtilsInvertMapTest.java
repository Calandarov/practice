package practice.task23;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.Map;

public class CollectionUtilsInvertMapTest {
    @Test
    public void reverseMap() {
        Map<String, Integer> expectedMap = Map.of("a", 1, "b", 2, "c", 3);
        Map<String, Integer> actualMap = CollectionUtilsInvertMap.reverseMap(Map.of(1, "a", 2, "b", 3, "c"));

        Assertions.assertEquals(expectedMap, actualMap);
    }
}
