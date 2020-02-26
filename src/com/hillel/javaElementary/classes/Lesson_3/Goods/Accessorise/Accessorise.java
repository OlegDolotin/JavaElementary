package com.hillel.javaElementary.classes.Lesson_3.Goods.Accessorise;

import com.hillel.javaElementary.classes.Lesson_3.Goods.Good;


import java.math.BigDecimal;

public class Accessorise extends Good {


    public Accessorise(String name, BigDecimal price, AccessoriseType type, long id, int count){
        this.price = price;
        this.name = name;
        this.id = id;
        this.count = count;
        this.accessoriseType = type;
        this.good = this;
    }

}
