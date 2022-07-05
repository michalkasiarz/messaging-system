package com.michalkasiarz;

import com.michalkasiarz.order.Order;
import com.michalkasiarz.order.OrderStatus;
import com.michalkasiarz.subscriptionChannel.Email;
import com.michalkasiarz.subscriptionChannel.Push;
import com.michalkasiarz.subscriptionChannel.SMS;

public class Main {

    public static void main(String[] args) {

        Order order = new Order(4222L, OrderStatus.IN_DELIVERY);

        Email email = new Email();
        Push push = new Push();
        SMS sms = new SMS();

        email.updateOrderStatus(order);
        push.updateOrderStatus(order);
        sms.updateOrderStatus(order);

    }
}
