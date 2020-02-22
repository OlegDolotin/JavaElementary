package com.hillel.javaElementary.classes.ThirdLesson;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private ArrayList<Product> product;
    private Customer customer;
    private ShippingDetails shippingDetails;
    private OrderStatus orderStatus;
    private long id;
    private Date date;

    public Order(ArrayList<Product> product, Customer customer, ShippingDetails shippingDetails, Date date, long id){
        this.product = product;
        this.customer = customer;
        this.shippingDetails = shippingDetails;
        this.id = id;
        this.date = date;
        orderStatus = OrderStatus.InProcess;
    }

    public ArrayList<Product> getProduct() {
        return product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ShippingDetails getShippingDetails() {
        return shippingDetails;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }
}
