package com.hillel.javaElementary.classes.Lesson_5.Building.Abstract;

import com.hillel.javaElementary.classes.Lesson_5.Building.Enum.EAgricultural;

public abstract class AgriculturalBuilding extends Building{
    protected EAgricultural type;

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "type=" + type;
    }
}
