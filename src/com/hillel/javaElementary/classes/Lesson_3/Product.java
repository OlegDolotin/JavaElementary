package com.hillel.javaElementary.classes.Lesson_3;

import com.hillel.javaElementary.classes.Lesson_3.Goods.Good;

import java.math.BigDecimal;

public  class Product {
    private String name;
    private BigDecimal price = new BigDecimal(0);
    private long id;
    private int count;
    private Good good;

    public Product(String name, BigDecimal cost, long id, int count, Good good){

        this.id = id;
        this.name = name;
        this.count = count;
        this.good = good;
        calculatePrice(cost);
    }


    public BigDecimal getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Good getGood() {
        return good;
    }

    private void calculatePrice(BigDecimal cost){
        price = cost.multiply(new BigDecimal(count));
    }
}
