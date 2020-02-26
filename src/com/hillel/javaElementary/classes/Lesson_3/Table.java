package com.hillel.javaElementary.classes.Lesson_3;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Table{
    private Long id;
    private LocalDate date;
    private OrderStatus status;
    private String firstNameProduct;
    private int productCount;
    private String customerName;
    private BigDecimal orderCost;
    private Boolean hasDelivery;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern( "dd.MM.uuuu" , Locale.UK );

    public Table(Long id, LocalDate date, OrderStatus status, String firstNameProduct, Integer productCount, String customerName,
                 BigDecimal orderCost, boolean hasDelivery){
        this.id = id;
        this.date = date;
        this.status = status;
        this.firstNameProduct = firstNameProduct;
        this.productCount = productCount;
        this.customerName = customerName;
        this.orderCost = orderCost;
        this.hasDelivery = hasDelivery;
    }

    public String toString() {
        String output = "";
        output += "|    "+id+"   | "
                +date.format(formatter)+" |   "
                +status+"  |      "
                +firstNameProduct+"     |         "
                +productCount+"        | "
                +customerName+" |    "
                +orderCost+"   |   "
                +hasDelivery+"   |\n";
        return output;
    }

    public LocalDate getDate() {
        return date;
    }

    public BigDecimal getOrderCost() {
        return orderCost;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public String getCustomerName() {
        return customerName;
    }




}
