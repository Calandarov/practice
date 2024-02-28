package practice.task20;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import java.util.Set;

public class CollectionUtilsUniqueValuesTest {
    @Test
    public void removeDuplicates() {
        Assert.assertEquals(Set.of(1, 2, 3, 4), CollectionUtilsUniqueValues.removeDuplicates(List.of(1, 2, 3, 3, 2, 4)));
        Assert.assertEquals(Set.of(0, 2, 1), CollectionUtilsUniqueValues.removeDuplicates(List.of(0, 2, 2, 1)));
        Assert.assertEquals(Set.of("test1", "test2", "test3"), CollectionUtilsUniqueValues.removeDuplicates(List.of("test1", "test2", "test2", "test3")));
    }
}
