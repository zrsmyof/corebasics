package com.zrs.custom.patterns.creational.singletone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zrs
 */
class SingleBankTest {

    @Test
    public void singleToneCheck() {
        assertEquals(SingleBank.getInstance(), SingleBank.getInstance());
    }

}