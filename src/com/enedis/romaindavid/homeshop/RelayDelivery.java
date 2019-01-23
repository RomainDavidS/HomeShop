package com.enedis.romaindavid.homeshop;

public class RelayDelivery implements Delivery {
    private Integer numRelay;

    public RelayDelivery(Integer numRelay) {
        this.numRelay = numRelay;
    }

    @Override
    public double getPrice() {
        if ( numRelay >=1 && numRelay < 23)
            return 0;
        else if ( numRelay > 22 && numRelay < 48 )
            return 2.99;
        else
            return 4.99;

    }
    @Override
    public String getInfo(){
        return "Retrait au relais à " + getPrice() +"€";
    }
}
