package list.core.util;

import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E> {
    private E[] values;
    int index;

    public ArrayIterator(E[] valies) {
        this.values = valies;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public E next() {
        return values[index++];
    }
}
