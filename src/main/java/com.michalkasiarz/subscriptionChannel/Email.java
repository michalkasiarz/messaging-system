package com.michalkasiarz.subscriptionChannel;

import com.michalkasiarz.order.Order;

public class Email {

    public void updateOrderStatus(Order order) {
        System.out.println("E-mail with the updated status of the order no. " + order.getOrderNumber() + " to " + order.getOrderStatus() + " has been sent.");
    }
}
