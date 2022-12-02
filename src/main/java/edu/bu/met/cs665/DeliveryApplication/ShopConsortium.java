package edu.bu.met.cs665.DeliveryApplication;

import java.util.HashSet;

/**
 * Name: Cecilia Chacko
 * Date: 10/03/2022
 * Description: This class portrays a consortium of shops that manages notifications for all observers.
 */
public class ShopConsortium implements Subject {

    private Shop shop;
    private HashSet<Observer> observers;

    /**
     * Constructor initializes a hash set to hold the observers.
     */
    public ShopConsortium() {
        observers = new HashSet<>();
    }

    /**
     * Method registers an observer to the set of observers, It is registered to receive
     * notifications.
     *
     * @param o - the observer to be registered
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * Method removes an observer from the set of observers. It can no longer receive
     * notifications.
     *
     * @param o - the observer to be removed
     */
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    /**
     * Method notifies all registered observers.
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(shop.getShopName(), shop.getShopAddress(), shop.getDeliveryRequest());
        }
    }

    /**
     * Method notifies observers when a delivery request is received.
     */
    public void receivedDeliveryRequest() {
        notifyObservers();
    }

    /**
     * Method sets a shop object. The observers are notified when a shop gets a new delivery request.
     *
     * @param shop - shop object
     */
    public void setShopRequest(Shop shop) {
        this.shop = shop;
        receivedDeliveryRequest();
    }

}
