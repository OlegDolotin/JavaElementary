package com.hillel.javaElementary.classes.ThirdLesson;

import java.math.BigDecimal;

public class ShippingDetails {
    private BigDecimal cost;
    private String address;
    private String notes;

    public ShippingDetails(BigDecimal cost, String address, String notes){
        this.cost = cost;
        this.address = address;
        this.notes = notes;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public String getAddress() {
        return address;
    }
}
