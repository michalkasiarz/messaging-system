package com.michalkasiarz.subscriptionChannel;

import com.michalkasiarz.order.Order;

public class SMS {

    public void updateOrderStatus(Order order) {
        System.out.println("SMS with the updated status of the order no. " + order.getOrderNumber() + " to " + order.getOrderStatus() + " has been sent.");
    }
}
