package com.michalkasiarz.subscriptionChannel;

import com.michalkasiarz.order.Order;

public class Email implements Observer {

    public void updateOrder(Order order) {
        System.out.println("E-mail:  Status of the order no. " + order.getOrderNumber() + " has changed to: " + order.getOrderStatus() + ".");
    }
}
