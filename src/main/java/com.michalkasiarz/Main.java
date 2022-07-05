package com.michalkasiarz;

import com.michalkasiarz.order.Order;
import com.michalkasiarz.order.OrderStatus;
import com.michalkasiarz.subscriptionChannel.Email;
import com.michalkasiarz.subscriptionChannel.Push;
import com.michalkasiarz.subscriptionChannel.SMS;

public class Main {

    public static void main(String[] args) {

        Order order = new Order(4222L, OrderStatus.PLACED);

        order.notifyObservers();

        Email email = new Email();
        Push push = new Push();
        SMS sms = new SMS();

        order.registerObserver(email);
        order.registerObserver(push);
        order.registerObserver(sms);

        order.updateOrder(OrderStatus.ACCEPTED);

        order.updateOrder(OrderStatus.IN_DELIVERY);

    }
}
