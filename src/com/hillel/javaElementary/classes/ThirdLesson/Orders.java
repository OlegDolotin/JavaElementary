package com.hillel.javaElementary.classes.ThirdLesson;

import java.util.ArrayList;
import java.util.Iterator;

public class Orders {
    ArrayList<Order> orders;

    public Orders(ArrayList<Order> orders){
        this.orders = orders;
    }

    public String showByOrderStatus(OrderStatus orderStatus){
        Iterator<Order> iterator = orders.iterator();
        Order temp;
        String output = "";
        while(iterator.hasNext()){
            temp = iterator.next();
            if (temp.getOrderStatus() == orderStatus){
                output += "id: " + temp.getId();
                output += " " + temp.getCustomer().getName();
                output += " " + temp.getShippingDetails().getAddress()+"/n";
            }
        }
        return output;
    }

    public String showProductByCountOfOrders(){
        String output = "Count of orders: "+ orders.size()+"/n";


        return output;
    }
}
