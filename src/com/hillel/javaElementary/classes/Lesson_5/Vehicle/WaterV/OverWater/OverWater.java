package com.hillel.javaElementary.classes.Lesson_5.Vehicle.WaterV.OverWater;

import com.hillel.javaElementary.classes.Lesson_5.Vehicle.WaterV.WaterV;

public abstract class OverWater extends WaterV {
    protected double draft;

    public double getDraft() {
        return draft;
    }

    public void setDraft(double draft) {
        this.draft = draft;
    }

    @Override
    public String toString() {
        return super.toString() +
                "draft= " + draft;
    }
}
