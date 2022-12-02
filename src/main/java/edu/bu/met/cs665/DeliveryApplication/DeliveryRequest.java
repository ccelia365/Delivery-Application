package edu.bu.met.cs665.DeliveryApplication;

/**
 * Name: Cecilia Chacko
 * Date: 10/03/2022
 * Description: This class creates a Delivery Request for a single customer.
 */
public class DeliveryRequest {

    private String customerName;
    private String customerAddress;
    private String productToDeliver;

    /**
     * Constructor initializes a delivery request. Sets the customer's name, address and product requested.
     *
     * @param customerName     - name of customer
     * @param customerAddress  - customer address
     * @param productToDeliver - product to be delivered to customer
     */
    public DeliveryRequest(String customerName, String customerAddress, String productToDeliver) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.productToDeliver = productToDeliver;
    }

    /**
     * Returns the name of the customer.
     *
     * @return customer name
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the name of the customer.
     *
     * @param customerName
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * Returns the address of the customer.
     *
     * @return customer address
     */
    public String getCustomerAddress() {
        return customerAddress;
    }

    /**
     * Sets the address of the customer.
     *
     * @param customerAddress
     */
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    /**
     * Returns the product to be delivered to customer.
     *
     * @return the product to be delivered
     */
    public String getProductToDeliver() {
        return productToDeliver;
    }

    /**
     * Sets the product to be delivered to customer.
     *
     * @param productToDeliver
     */
    public void setProductToDeliver(String productToDeliver) {
        this.productToDeliver = productToDeliver;
    }

}
