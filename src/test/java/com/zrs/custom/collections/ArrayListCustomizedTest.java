package com.zrs.custom.collections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zrs
 */
class ArrayListCustomizedTest {

    @Test
    void arrayListTest() {
        ArrayListCustomized<Integer> list = new ArrayListCustomized<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3, list.size());

        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));

        assertEquals(2, list.remove(1));
        assertEquals(2, list.size());
    }
}