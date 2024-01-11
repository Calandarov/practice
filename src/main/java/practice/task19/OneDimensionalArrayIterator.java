package practice.task19;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class OneDimensionalArrayIterator<T> implements Iterator<T> {
    private final T[] array;
    private int index = 0;
    public OneDimensionalArrayIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public T next() throws NoSuchElementException {
        if(!hasNext()) {
            throw new NoSuchElementException();
        }

        index++;
        return array[index - 1];
    }

    public String printItems() {
        StringBuilder builder = new StringBuilder("Элементы массива: ");

        while(this.hasNext()) {
            builder.append(this.next()).append(" ");
        }

        return builder.toString();
    }
}
