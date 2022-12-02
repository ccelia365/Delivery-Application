package edu.bu.met.cs665.DeliveryApplication;

/**
 * Name: Cecilia Chacko
 * Date: 10/03/2022
 * Description: This class creates a single driver.
 */
public class Driver implements Observer, DisplayElement {

    private String driverName;
    private String vehicleType;
    private String licenseNumber;
    protected String shopName;
    protected String shopAddress;
    protected DeliveryRequest deliveryRequest;

    /**
     * Constructor initializes a driver.
     *
     * @param driverName    - the name of the driver
     * @param licenseNumber - the license number of the driver
     */
    public Driver(String driverName, String licenseNumber) {
        this.driverName = driverName;
        this.licenseNumber = licenseNumber;
    }

    /**
     * Returns the name of the driver.
     *
     * @return the name of the driver
     */
    public String getDriverName() {
        return driverName;
    }

    /**
     * Sets the name of the driver.
     *
     * @param driverName
     */
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    /**
     * Returns the vehicle type used by the driver.
     *
     * @return the vehicle used by the driver
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * Sets the vehicle type used by the driver.
     *
     * @param vehicleType
     */
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    /**
     * Returns the license number of the driver.
     *
     * @return the license number of the driver
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Sets the license number of the driver.
     *
     * @param licenseNumber
     */
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    /**
     * Returns the name of the shop.
     *
     * @return the name of the shop
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
     * @return the address of the shop
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
     * Returns a delivery request.
     *
     * @return a delivery request
     */
    public DeliveryRequest getDeliveryRequest() {
        return deliveryRequest;
    }

    /**
     * Sets a delivery request.
     *
     * @param deliveryRequest
     */
    public void setDeliveryRequest(DeliveryRequest deliveryRequest) {
        this.deliveryRequest = deliveryRequest;
    }

    /**
     * Method displays a new notification for every delivery request received.
     *
     * @param shopName        - the name of the shop
     * @param shopAddress     - the address of the shop
     * @param deliveryRequest - the delivery request
     */
    @Override
    public void update(String shopName, String shopAddress, DeliveryRequest deliveryRequest) {
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.deliveryRequest = deliveryRequest;
        this.display();

    }

    /**
     * Method displays a notification.
     */
    @Override
    public void display() {
        System.out.println("\n ATTN: NEW REQUEST"
                + " \n Driver Name: " + getDriverName()
                + " \n License Number: " + getLicenseNumber()
                + " \n Shop Name: " + getShopName()
                + " \n Shop Address: " + getShopAddress()
                + " \n Product Name: " + deliveryRequest.getProductToDeliver()
                + " \n Customer Name: " + deliveryRequest.getCustomerName()
                + " \n Customer Address: " + deliveryRequest.getCustomerAddress()
        );
    }
}
