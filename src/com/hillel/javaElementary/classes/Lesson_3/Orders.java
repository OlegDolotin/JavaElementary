package com.hillel.javaElementary.classes.Lesson_3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;


public class Orders {
    private  ArrayList<Order> orders;

    public Orders(ArrayList<Order> orders){
        this.orders = orders;
    }

    public String showByOrderStatus(OrderStatus orderStatus){
        String output = "";
        for (Order temp: orders) {
            if (temp.getOrderStatus() == orderStatus){
                output += "id: " + temp.getId();
                output += " " + temp.getCustomer().getName();
                if (temp.hasDelivery()) {
                    output += " " + temp.getDelivery().getAddress() + "\n";
                }else {
                    output += "Doesn't have delivery\n";
                }
            }
        }
        return output;
    }

    public String showProductByCountOfOrders(){
        OrderCount orderCount = new OrderCount();
        String output = "Count of orders: "+ orders.size()+"\n";
        for (Order tempOrder: orders){
            for (Product tempProduct: tempOrder.getProduct()) {
                orderCount.put(tempProduct.getId());
            }
        }
        orderCount.sortByCount();
        return output+orderCount.toString();
    }

    public String createTable(){
        String output = "|   Id   |    Date    |    Status    | First product name | Product quantity | Customer name | Order cost | Delivery |\n";
        ArrayList<Table> table = new ArrayList<>();
        for (Order tempOrder:orders) {
            table.add(new Table(tempOrder.getId(),
                      tempOrder.getDate(),
                      tempOrder.getOrderStatus(),
                      getFirstProductName(tempOrder),
                      tempOrder.getProduct().size(),
                      tempOrder.getCustomer().getName(),
                      getCorrectCost(tempOrder),
                      tempOrder.hasDelivery()));
        }
        TableComparator tableComparator = new TableComparator();
        table.sort(tableComparator);
        for (Table tempTable: table) {
            output += tempTable.toString();
        }
        return output;
    }

    public String getClientWithOrders(){
        String output = "";
        HashSet<Customer> customers = new HashSet<>();
        CustomerOrder customerOrder = new CustomerOrder();
        customers = getUniqCustomers(customers);
        for (Customer tempCustomer: customers) {
            for (Order tempOrder: orders) {
                if (tempCustomer.getName().equals(tempOrder.getCustomer().getName())){
                    customerOrder.put(tempCustomer.getName(), tempOrder.getCost(), getCorrectCost(tempOrder));
                }
            }
        }

        return customerOrder.toString();
    }


    private BigDecimal getCorrectCost(Order tempOrder){
        BigDecimal temp = new BigDecimal(0);
        if (tempOrder.hasDelivery()){
            temp = temp.add(tempOrder.getDelivery().getCost());
        }else {
            temp = temp.add(tempOrder.getCost());
        }
        return temp;
    }

    private String getFirstProductName(Order order){
        return order.getProduct().get(0).getName();
    }

    private HashSet<Customer> getUniqCustomers(HashSet<Customer> customers){
        for (Order tempOrder: orders) {
            customers.add(tempOrder.getCustomer());
        }
        return customers;
    }
}
