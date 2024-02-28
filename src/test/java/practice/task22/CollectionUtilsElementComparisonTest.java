package practice.task22;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.List;

public class CollectionUtilsElementComparisonTest {
    @Test
    public void compareIdenticalList() {
        Assertions.assertTrue(CollectionUtilsElementComparison.compareElements(List.of(1, 2, 3), List.of(1, 2, 3)));
        Assertions.assertTrue(CollectionUtilsElementComparison.compareElements(List.of("str1", "str2", "str3"), List.of("str1", "str2", "str3")));
    }

    @Test
    public void compareDifferentList() {
        Assertions.assertFalse(CollectionUtilsElementComparison.compareElements(List.of(1, 2, 3), List.of(4, 5, 6)));
        Assertions.assertFalse(CollectionUtilsElementComparison.compareElements(List.of("str1", "str1", "str3"), List.of("str1", "str2", "str3")));
    }
}
