package com.example.testrest.model;

public class Item {

    int itemId;
    int itemPrice;

    public Item(int itemId, int itemPrice) {
        this.itemId = itemId;
        this.itemPrice = itemPrice;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }
    public  Item(){

    }
}
