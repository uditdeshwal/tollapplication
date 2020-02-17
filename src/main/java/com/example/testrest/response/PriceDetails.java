package com.example.testrest.response;

import com.example.testrest.model.Discount;

import java.util.Set;

public class PriceDetails {

    public PriceDetails(){

    }
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Set<Discount> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(Set<Discount> discounts) {
        this.discounts = discounts;
    }

    public PriceDetails(int total, Set<Discount> discounts) {
        this.total = total;
        this.discounts = discounts;
    }

    int total;
    Set<Discount> discounts;
}
