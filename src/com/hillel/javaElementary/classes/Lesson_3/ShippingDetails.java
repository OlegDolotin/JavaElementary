package com.hillel.javaElementary.classes.Lesson_3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;

public class ShippingDetails {
    private BigDecimal cost  = new BigDecimal(0);
    private String address;
    private String notes;
    private ArrayList<Product> products;


    public ShippingDetails(String address, String notes, ArrayList<Product> products){
        this.address = address;
        this.notes = notes;
        this.products = products;
        getFinalCost();
    }

    public BigDecimal getCost() {
        return cost;
    }

    private void getFinalCost(){
        cost = getCostWithoutDelivery();
        cost = cost.add(new BigDecimal(45));
    }

    private BigDecimal getCostWithoutDelivery(){
        BigDecimal sum = new BigDecimal(0);
        for (Product product :products) {
            sum =sum.add(product.getPrice());
        }
        return sum;
    }

    public String getAddress() {
        return address;
    }

    public String getNotes() {
        return notes;
    }
}
