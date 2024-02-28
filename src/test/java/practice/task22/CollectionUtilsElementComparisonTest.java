package practice.task22;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CollectionUtilsElementComparisonTest {
    @Test
    public void compareIdenticalList() {
        Assert.assertTrue(CollectionUtilsElementComparison.compareElements(List.of(1, 2, 3), List.of(1, 2, 3)));
        Assert.assertTrue(CollectionUtilsElementComparison.compareElements(List.of("str1", "str2", "str3"), List.of("str1", "str2", "str3")));
    }

    @Test
    public void compareDifferentList() {
        Assert.assertFalse(CollectionUtilsElementComparison.compareElements(List.of(1, 2, 3), List.of(4, 5, 6)));
        Assert.assertFalse(CollectionUtilsElementComparison.compareElements(List.of("str1", "str1", "str3"), List.of("str1", "str2", "str3")));
    }
}
