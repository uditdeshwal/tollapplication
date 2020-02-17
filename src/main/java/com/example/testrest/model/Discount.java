package com.example.testrest.model;

import java.util.Date;

public class Discount {

    public int getDiscountId() {
        return discountId;
    }

    public void setDiscountId(int discountId) {
        this.discountId = discountId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Discount(int discountId, int itemId, Date startDate, Date endDate, int discount) {
        this.discountId = discountId;
        this.itemId = itemId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.discount = discount;
    }

    public  Discount(){

    }

    private  int discountId;
    private  int itemId;
    private  Date startDate;
    private Date endDate;
    private  int discount;


    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
