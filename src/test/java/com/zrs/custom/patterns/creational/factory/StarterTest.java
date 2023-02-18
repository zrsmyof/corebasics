package com.zrs.custom.patterns.creational.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author zrs
 */
class StarterTest {

    @Test
    void go() throws IllegalAccessException {
        new Starter().go("java");
        new Starter().go("python");
        assertThrows(IllegalAccessException.class, () -> new Starter().go("ruby"));
    }
}