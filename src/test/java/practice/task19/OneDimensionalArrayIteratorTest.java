package practice.task19;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class OneDimensionalArrayIteratorTest {
    @Test
    public void printItems() {
        Integer[] intArray = {1, 2, 3, 4};
        String[] strArray = {"s", "t", "r", "i", "n", "g"};
        OneDimensionalArrayIterator<Integer> intItr = new OneDimensionalArrayIterator<>(intArray);
        OneDimensionalArrayIterator<String> strItr = new OneDimensionalArrayIterator<>(strArray);

        Assertions.assertEquals("Элементы массива: 1 2 3 4 ", intItr.printItems());
        Assertions.assertEquals("Элементы массива: s t r i n g ", strItr.printItems());
    }
}
