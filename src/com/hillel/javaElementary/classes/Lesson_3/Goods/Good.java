package com.hillel.javaElementary.classes.Lesson_3.Goods;

import com.hillel.javaElementary.classes.Lesson_3.Goods.Accessorise.AccessoriseType;
import com.hillel.javaElementary.classes.Lesson_3.Goods.TShorts.TShortColor;
import com.hillel.javaElementary.classes.Lesson_3.Goods.TShorts.TShortSize;


import java.math.BigDecimal;

public abstract class Good {
    protected AccessoriseType accessoriseType;
    protected long id;
    protected BigDecimal price;
    protected String name;
    protected int count;
    protected TShortSize size;
    protected TShortColor color;
    protected Good good;


    public TShortColor getColor() {
        return color;
    }

    public TShortSize getSize() {
        return size;
    }

    public long getId(){
        return id;
    }

    public BigDecimal getPrice(){
        return price;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public Good getGood() {
        return good;
    }

    public AccessoriseType getAccessoriseType() {
        return accessoriseType;
    }

}
