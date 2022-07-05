package com.michalkasiarz.subscriptionChannel;

import com.michalkasiarz.order.Order;

public interface Observer {

    void updateOrder(Order order);

}
