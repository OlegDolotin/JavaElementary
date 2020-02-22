package com.hillel.javaElementary.classes.ThirdLesson;

import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal cost;
    private long id;

    public Product(BigDecimal cost, long id){
        this.cost = cost;
        this.id = id;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public long getId() {
        return id;
    }
}
