package com.hillel.javaElementary.classes.Lesson_3;

import java.util.Comparator;

public class TableComparator implements Comparator<Table> {
    @Override
    public int compare(Table o1, Table o2) {
        int result = o2.getDate().compareTo(o1.getDate());
        if (result != 0){
            return result;
        }

        result = o1.getStatus().compareTo(o2.getStatus());
        if (result !=0){
            return result;
        }

        result = o1.getCustomerName().compareTo(o2.getCustomerName());
        if (result != 0){
            return result;
        }

        result = o2.getOrderCost().compareTo(o1.getOrderCost());

        return result;
    }


}
