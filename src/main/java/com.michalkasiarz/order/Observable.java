package com.michalkasiarz.order;

import com.michalkasiarz.subscriptionChannel.Observer;

public interface Observable {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}
