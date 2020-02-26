package com.hillel.javaElementary.classes.Lesson_3.Goods.TShorts;

import com.hillel.javaElementary.classes.Lesson_3.Goods.Good;

import java.math.BigDecimal;

public class TShorts extends Good {

    public TShorts(String name, BigDecimal price, TShortColor color, long id, TShortSize size, TShortType type, int count) {
        this.price = price;
        this.color = color;
        this.id = id;
        this.size = size;
        this.name = name;
        this.count = count;
        this.good = this;
    }

}
