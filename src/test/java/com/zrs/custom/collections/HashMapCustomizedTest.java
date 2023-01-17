package com.zrs.custom.collections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zrs
 */
class HashMapCustomizedTest {

    @Test
    void customHashMapTest() {
        HashMapCustomized<String, Integer> mapCustomized = new HashMapCustomized<>();
        mapCustomized.put("One", 1);
        mapCustomized.put("Two", 2);
        mapCustomized.put("Three", 3);
        mapCustomized.put("Four", 4);

        assertEquals(2, mapCustomized.get("Two"));

        mapCustomized.put("Two", 1234);
        assertEquals(1234, mapCustomized.get("Two"));
    }
}