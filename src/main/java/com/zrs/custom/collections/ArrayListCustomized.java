package com.zrs.custom.collections;

import java.util.Arrays;

/**
 * @author zrs
 */
public class ArrayListCustomized<E> {

    Object[] array;
    int size;

    public ArrayListCustomized() {
        this.array = new Object[16];
        this.size = 0;
    }

    public void add(E element) {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size++] = element;
    }

    @SuppressWarnings("unchecked")
    public E get(int idx) {
        if (idx > size - 1 || idx < 0) {
            throw new IndexOutOfBoundsException();
        }
        return (E) array[idx];
    }

    @SuppressWarnings("unchecked")
    public E remove(int idx) {
        if (idx > size || idx < 0) {
            throw new IndexOutOfBoundsException();
        }
        E removedElement = (E) array[idx];
        for (int i = idx; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return removedElement;
    }


    public int size() {
        return size;
    }
}
