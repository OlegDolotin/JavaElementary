package com.hillel.javaElementary.classes.Lesson_3;

import com.hillel.javaElementary.classes.Lesson_3.Goods.Accessorise.Accessorise;
import com.hillel.javaElementary.classes.Lesson_3.Goods.Accessorise.AccessoriseType;
import com.hillel.javaElementary.classes.Lesson_3.Goods.TShorts.TShortColor;
import com.hillel.javaElementary.classes.Lesson_3.Goods.TShorts.TShortSize;
import com.hillel.javaElementary.classes.Lesson_3.Goods.TShorts.TShortType;
import com.hillel.javaElementary.classes.Lesson_3.Goods.TShorts.TShorts;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int productID = 1;
        Customer client1 = new Customer("Tomas Edison ", 0);
        Customer client2 = new Customer("Emma Striper ", 1);

        TShorts tShorts1 = new TShorts("Calvin 3n", new BigDecimal(500), TShortColor.Black, 0, TShortSize.M, TShortType.Basic, 1);
        TShorts tShorts2 = new TShorts("Tommy 5d", new BigDecimal(700), TShortColor.White, 1, TShortSize.S, TShortType.Basic, 2);
        TShorts tShorts3 = new TShorts("Lacoste  ", new BigDecimal(1200), TShortColor.Black, 2, TShortSize.L, TShortType.Printed, 5);

        Accessorise accessorise1 = new Accessorise("Lacoste 2h", new BigDecimal(2000), AccessoriseType.Glasses, 0, 2);
        Accessorise accessorise2 = new Accessorise("Galaxy Watch", new BigDecimal(150), AccessoriseType.Watch, 1, 1);

        Product product1 = new Product(tShorts1.getName(), tShorts1.getPrice(), productID++, tShorts1.getCount(), tShorts1.getGood());
        Product product2 = new Product(tShorts2.getName(), tShorts2.getPrice(), productID++, tShorts2.getCount(), tShorts2.getGood());
        Product product3 = new Product(tShorts3.getName(), tShorts3.getPrice(), productID++, tShorts3.getCount(), tShorts3.getGood());
        Product product4 = new Product(accessorise1.getName(), accessorise1.getPrice(), productID++, accessorise1.getCount(), accessorise1.getGood());
        Product product5 = new Product(accessorise2.getName(), accessorise2.getPrice(), productID++, accessorise2.getCount(), accessorise2.getGood());

        ArrayList<Product> client_1_list = new ArrayList<>();
        client_1_list.add(product1);
        client_1_list.add(product2);
        client_1_list.add(product4);
        ArrayList<Product> client_2_list = new ArrayList<>();
        client_2_list.add(product3);
        client_2_list.add(product4);
        client_2_list.add(product2);
        client_2_list.add(product2);
        client_2_list.add(product2);
        client_2_list.add(product5);
        ShippingDetails shippingDetails1 = new ShippingDetails("Naukova aveny 7","dfgsdjfhdslfjslfsfs" ,client_1_list);
        ShippingDetails shippingDetails2 = new ShippingDetails("Pashkovskogo street 8", "sdfksdfsdjfksdjf", client_2_list);
        Order order1 = new Order(client_1_list, client1, shippingDetails1, LocalDate.now(), 0);
        Order order2 = new Order(client_2_list, client2, shippingDetails2, LocalDate.now(), 1);
        Order order3 = new Order(client_1_list, client1, null, LocalDate.now(), 2);
        Order order4 = new Order(client_2_list, client2, null, LocalDate.now(), 3);
        Order order5 = new Order(client_1_list, client1, null, LocalDate.now(), 4);
        Order order6 = new Order(client_2_list, client2, shippingDetails2, LocalDate.now(), 5);
        Order order7 = new Order(client_1_list, client1, null, LocalDate.now(), 6);
        Order order8 = new Order(client_2_list, client2, null, LocalDate.of(2018, 2,23), 7);
        Order order9 = new Order(client_1_list, client1, shippingDetails1, LocalDate.now(), 1);
        Order order10 = new Order(client_2_list, client2, null, LocalDate.of(2018, 2,23), 8);
        ArrayList<Order> orderList = new ArrayList<>();
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
        orderList.add(order4);
        orderList.add(order5);
        orderList.add(order6);
        orderList.add(order7);
        orderList.add(order8);
        orderList.add(order9);
        orderList.add(order10);
        Orders orders = new Orders(orderList);
        System.out.println(orders.showByOrderStatus(OrderStatus.InProcess));
        System.out.println();
        System.out.println(orders.showProductByCountOfOrders());
        System.out.println();
        System.out.println(orders.createTable());
        System.out.println();
        System.out.println(orders.getClientWithOrders());
    }
}
