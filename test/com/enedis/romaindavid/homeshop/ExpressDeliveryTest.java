package com.enedis.romaindavid.homeshop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressDeliveryTest {
    @Test
    public void Given_ExpressDeliveryParis_When_GettingPrice_Then_Get6e99() {
        Delivery delivery = new ExpressDelivery("Paris");
        assertEquals(6.99,delivery.getPrice(),0.01);
    }
    @Test
    public void Given_ExpressDeliveryOtherParis_When_GettingPrice_Then_Get9e99() {
        Delivery delivery = new ExpressDelivery("Toulouse");
        assertEquals(9.99,delivery.getPrice(),0.01);
    }
}