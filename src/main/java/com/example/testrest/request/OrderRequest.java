package com.example.testrest.request;

import java.util.Date;

public class OrderRequest {

   private String itemId;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getAsOfNow() {
        return asOfNow;
    }

    public void setAsOfNow(Date asOfNow) {
        this.asOfNow = asOfNow;
    }

    private int id;
    private Date asOfNow;
}
