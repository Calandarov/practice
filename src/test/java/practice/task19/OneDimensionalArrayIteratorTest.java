package practice.task19;

import org.junit.Assert;
import org.junit.Test;

public class OneDimensionalArrayIteratorTest {
    Integer[] intArray = {1, 2, 3, 4};
    String[] strArray = {"s", "t", "r", "i", "n", "g"};
    OneDimensionalArrayIterator<Integer> intItr = new OneDimensionalArrayIterator<>(intArray);
    OneDimensionalArrayIterator<String> strItr = new OneDimensionalArrayIterator<>(strArray);
    @Test
    public void printItems() {
        Assert.assertEquals("Элементы массива: 1 2 3 4 ", intItr.printItems());
        Assert.assertEquals("Элементы массива: s t r i n g ", strItr.printItems());
    }
}
