package edu.bu.met.cs665.DeliveryApplication;

/**
 * Name: Cecilia Chacko
 * Date: 10/03/2022
 * Description: This class creates a single shop.
 */
public class Shop {
    private String shopName;
    private String shopAddress;
    private DeliveryRequest deliveryRequest;

    /**
     * Constructor initializes a shop. Sets the shop's name, address, and delivery request linked
     * to the shop.
     *
     * @param shopName        - the name of the shop
     * @param shopAddress     - the address of the shop
     * @param deliveryRequest - the delivery request connected to the shop
     */
    public Shop(String shopName, String shopAddress, DeliveryRequest deliveryRequest) {
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.deliveryRequest = deliveryRequest;
    }

    /**
     * Returns the shop name.
     *
     * @return shop name
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * Sets the name of the shop.
     *
     * @param shopName
     */
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    /**
     * Returns the address of the shop.
     *
     * @return shop address
     */
    public String getShopAddress() {
        return shopAddress;
    }

    /**
     * Sets the address of the shop.
     *
     * @param shopAddress
     */
    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    /**
     * Returns the delivery request connected to the shop.
     *
     * @return the delivery request
     */
    public DeliveryRequest getDeliveryRequest() {
        return deliveryRequest;
    }

    /**
     * Sets the delivery request.
     *
     * @param deliveryRequest
     */
    public void setDeliveryRequest(DeliveryRequest deliveryRequest) {
        this.deliveryRequest = deliveryRequest;
    }
}
