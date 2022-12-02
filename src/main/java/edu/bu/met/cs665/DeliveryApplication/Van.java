package edu.bu.met.cs665.DeliveryApplication;

/**
 * Name: Cecilia Chacko
 * Date: 10/03/2022
 * Description: This class creates a Van driver.
 */
public class Van extends Driver {

    /**
     * Constructor initializes the driver. Sets the type of vehicle used by driver.
     *
     * @param driverName
     * @param licenseNumber
     */
    public Van(String driverName, String licenseNumber) {
        super(driverName, licenseNumber);
        this.setVehicleType("Van");
    }

    /**
     * Method displays a notification.
     */
    @Override
    public void display() {
        System.out.println("\n ATTN: NEW REQUEST"
                + "\n Driver Name: " + getDriverName()
                + " \n Driver Type: " + getVehicleType()
                + " \n License Number: " + getLicenseNumber()
                + " \n Shop Name: " + getShopName()
                + " \n Shop Address: " + getShopAddress()
                + " \n Product Name: " + deliveryRequest.getProductToDeliver()
                + " \n Customer Name: " + deliveryRequest.getCustomerName()
                + " \n Customer Address: " + deliveryRequest.getCustomerAddress()
        );
    }
}
