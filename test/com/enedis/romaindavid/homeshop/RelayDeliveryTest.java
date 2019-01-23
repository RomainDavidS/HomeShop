package com.enedis.romaindavid.homeshop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelayDeliveryTest {
    @Test
    public void Given_SmallRelayDelivery_When_GettingPrice_Then_Get0e() {
        Delivery delivery = new RelayDelivery( 8 );
        assertEquals(0,delivery.getPrice(),0.01);
    }
    @Test
    public void Given_MiddleRelayDelivery_When_GettingPrice_Then_Get2e99() {
        Delivery delivery = new RelayDelivery( 30 );
        assertEquals(2.99,delivery.getPrice(),0.01);
    }
    @Test
    public void Given_HightRelayDelivery_When_GettingPrice_Then_Get4e99() {
        Delivery delivery = new RelayDelivery( 70);
        assertEquals(4.99,delivery.getPrice(),0.01);
    }
}