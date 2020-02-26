package com.hillel.javaElementary.classes.Lesson_3;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Order {
    private ArrayList<Product> product;
    private Customer customer;
    private ShippingDetails delivery;
    private OrderStatus orderStatus;
    private long id;
    private LocalDate date;
    private BigDecimal cost = new BigDecimal(0);;

    public Order(ArrayList<Product> product, Customer customer, ShippingDetails delivery, LocalDate date, long id){
        this.product = product;
        this.customer = customer;
        this.delivery = delivery;
        this.id = id;
        this.date = date;
        orderStatus = OrderStatus.InProcess;
        calculateCost();
    }

    public ArrayList<Product> getProduct() {
        return product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ShippingDetails getDelivery() {
        return delivery;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public long getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    private void calculateCost(){
        for (Product product: product) {
            cost = cost.add(product.getPrice());
        }
    }

    public BigDecimal getCost() {
        return cost;
    }

    public boolean hasDelivery(){
        if(delivery == null){
            return false;
        }else {
            return true;
        }
    }
}
