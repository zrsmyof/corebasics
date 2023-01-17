package com.zrs.custom.collections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zrs
 */
class DoubleLinkedListTest {

    @Test
    void listTest() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3, list.size());

        assertEquals(list.head, list.getNode(0));
        assertEquals(list.last, list.getNode(2));

        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));

        assertEquals(2, list.getNode(1).item);
        assertEquals(list.getNode(2), list.getNode(1).next);
        assertEquals(list.getNode(0), list.getNode(1).prev);

        assertEquals(2, list.remove(1));
        assertEquals(2, list.size());

    }
}