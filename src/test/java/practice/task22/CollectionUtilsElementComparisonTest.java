package practice.task22;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CollectionUtilsElementComparisonTest {
    @Test
    public void isValuesMatch() {
        Assert.assertFalse(CollectionUtilsElementComparison.isValuesMatch(List.of(1, 2, 3), List.of(4, 5, 6)));

        Assert.assertTrue(CollectionUtilsElementComparison.isValuesMatch(List.of(7, 8, 9), List.of(7, 8, 8, 9)));
    }
}
