package edu.bu.met.cs665.DeliveryApplication;

/**
 * Name: Cecilia Chacko
 * Date: 10/03/2022
 * Description: This interface creates a Subject for the Observer Pattern.
 */
public interface Subject {

    /**
     * Method registers an observer.
     *
     * @param o - the observer to be registered
     */
    public void registerObserver(Observer o);

    /**
     * Method removes an observer.
     *
     * @param o - the observer to be removed
     */
    public void removeObserver(Observer o);

    /**
     * Method notifies all observers.
     */
    public void notifyObservers();


}
