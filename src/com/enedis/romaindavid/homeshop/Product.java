package com.enedis.romaindavid.homeshop;

public class Product {

    String name;
    String description;
    double price;

    public void look(){

    }

    /**
     *
     * @param bill
     * @param quantity
     */
    public void buy(Bill bill,Integer quantity){

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
