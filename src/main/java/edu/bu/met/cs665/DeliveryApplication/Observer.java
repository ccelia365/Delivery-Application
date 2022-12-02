package edu.bu.met.cs665.DeliveryApplication;

/**
 * Name: Cecilia Chacko
 * Date: 10/03/2022
 * Description: This interface creates an Observer for the Observer Pattern.
 */
public interface Observer {

    /**
     * Method must be implemented by all observers. The parameters are values that the Observers
     * get from the Subject when a delivery request is received.
     *
     * @param shopName        - the name of the shop
     * @param shopAddress     - the address of the shop
     * @param deliveryRequest - the delivery request
     */
    public void update(String shopName, String shopAddress, DeliveryRequest deliveryRequest);

}
