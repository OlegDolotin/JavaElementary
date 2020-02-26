package com.hillel.javaElementary.classes.Lesson_3;

import java.util.Comparator;

public class TableComparator implements Comparator<Table> {
    @Override
    public int compare(Table o1, Table o2) {
        int result = o1.getDate().compareTo(o2.getDate()) * -1;
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

        result = o1.getOrderCost().compareTo(o2.getOrderCost()) * -1;

        return result;
    }


}
