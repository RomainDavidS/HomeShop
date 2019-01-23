package com.enedis.romaindavid.homeshop;

public class WarehouseDelivery implements Delivery {
    @Override
    public double getPrice() {
        return 0;
    }
    @Override
    public String getInfo(){
        return "Retrait à l'entrepot à" + getPrice() +"€";
    }
}
