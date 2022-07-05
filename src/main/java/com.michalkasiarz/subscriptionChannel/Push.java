package com.michalkasiarz.subscriptionChannel;

import com.michalkasiarz.order.Order;

public class Push implements Observer {

    public void updateOrder(Order order) {
        System.out.println("Push notification:  Status of the order no. " + order.getOrderNumber() + " has changed to: " + order.getOrderStatus() + ".");
    }
}
