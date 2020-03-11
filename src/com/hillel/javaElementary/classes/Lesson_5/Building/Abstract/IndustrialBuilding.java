package com.hillel.javaElementary.classes.Lesson_5.Building.Abstract;

import com.hillel.javaElementary.classes.Lesson_5.Building.Enum.EIndustrial;

public abstract class IndustrialBuilding extends Building{
    protected EIndustrial type;
    private int countOfWorkers;

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "type=" + type +
                ", countOfWorkers=" + countOfWorkers;
    }
}
