package com.michalkasiarz.subscriptionChannel;

import com.michalkasiarz.order.Order;

public class SMS implements Observer {

    public void updateOrder(Order order) {
        System.out.println("SMS:  Status of the order no. " + order.getOrderNumber() + " has changed to: " + order.getOrderStatus() + ".");
    }
}
