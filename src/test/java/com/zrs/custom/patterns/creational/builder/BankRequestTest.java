package com.zrs.custom.patterns.creational.builder;

import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;
import java.util.UUID;

/**
 * @author zrs
 */
class BankRequestTest {

    @Test
    public void builderTest() {
        BankRequest bankRequest = new BankRequest.BankRequestBuilder()
                .withRequestDate(ZonedDateTime.now())
                .withRqUid(UUID.randomUUID())
                .withAmount(1000)
                .withClientAge(25)
                .withClientName("Bob")
                .withClientSurname("Bobov")
                .withClientMiddleName("Bobovich")
                .build();
        System.out.println(bankRequest);
    }


}