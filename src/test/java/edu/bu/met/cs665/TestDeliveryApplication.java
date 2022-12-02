package edu.bu.met.cs665;

import edu.bu.met.cs665.DeliveryApplication.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Name: Cecilia Chacko
 * Date: 10/03/2022
 * Description: This class tests ShopConsortium, Shop, Driver and DeliveryRequest objects
 */
public class TestDeliveryApplication {

    ShopConsortium consortium = new ShopConsortium();

    Driver vanDriver1 = new Van("John Doe", "S11122233");
    Driver vanDriver2 = new Van("Jane Smith", "S22233344");
    Driver vanDriver3 = new Van("Peter Parker", "S55566678");
    Driver taxiDriver1 = new Taxi("Emily Johns", "S33344456");
    Driver taxiDriver2 = new Taxi("Tom Sawyer", "S44455567");
    Driver taxiDriver3 = new Taxi("Jack Smith", "S66677788");

    DeliveryRequest delivery1 = new DeliveryRequest("Michael Smith", "123 Pleasant St",
            "Big Mac Cheeseburger");
    Shop shop1 = new Shop("McDonalds", "345 Main St", delivery1);

    @Test
    public void testDriverName() {
        assertEquals(vanDriver1.getDriverName(), "John Doe");
        assertEquals(vanDriver2.getDriverName(), "Jane Smith");
        assertEquals(vanDriver3.getDriverName(), "Peter Parker");
        assertEquals(taxiDriver1.getDriverName(), "Emily Johns");
        assertEquals(taxiDriver2.getDriverName(), "Tom Sawyer");
        assertEquals(taxiDriver3.getDriverName(), "Jack Smith");
    }

    @Test
    public void testDriverLicense() {
        assertEquals(vanDriver1.getLicenseNumber(), "S11122233");
        assertEquals(vanDriver2.getLicenseNumber(), "S22233344");
        assertEquals(vanDriver3.getLicenseNumber(), "S55566678");
        assertEquals(taxiDriver1.getLicenseNumber(), "S33344456");
        assertEquals(taxiDriver2.getLicenseNumber(), "S44455567");
        assertEquals(taxiDriver3.getLicenseNumber(), "S66677788");
    }

    @Test
    public void testShopName() {
        consortium.registerObserver(vanDriver1);
        consortium.registerObserver(vanDriver2);
        consortium.registerObserver(vanDriver3);
        consortium.registerObserver(taxiDriver1);
        consortium.registerObserver(taxiDriver2);
        consortium.registerObserver(taxiDriver3);

        consortium.setShopRequest(shop1);

        assertEquals(vanDriver1.getShopName(), "McDonalds");
        assertEquals(vanDriver2.getShopName(), "McDonalds");
        assertEquals(vanDriver3.getShopName(), "McDonalds");
        assertEquals(taxiDriver1.getShopName(), "McDonalds");
        assertEquals(taxiDriver2.getShopName(), "McDonalds");
        assertEquals(taxiDriver3.getShopName(), "McDonalds");

    }

    @Test
    public void testShopAddress() {
        consortium.registerObserver(vanDriver1);
        consortium.registerObserver(vanDriver2);
        consortium.registerObserver(vanDriver3);
        consortium.registerObserver(taxiDriver1);
        consortium.registerObserver(taxiDriver2);
        consortium.registerObserver(taxiDriver3);

        consortium.setShopRequest(shop1);

        assertEquals(vanDriver1.getShopAddress(), "345 Main St");
        assertEquals(vanDriver2.getShopAddress(), "345 Main St");
        assertEquals(vanDriver3.getShopAddress(), "345 Main St");
        assertEquals(taxiDriver1.getShopAddress(), "345 Main St");
        assertEquals(taxiDriver2.getShopAddress(), "345 Main St");
        assertEquals(taxiDriver3.getShopAddress(), "345 Main St");
    }

    @Test
    public void testCustomerName() {
        consortium.registerObserver(vanDriver1);
        consortium.registerObserver(vanDriver2);
        consortium.registerObserver(vanDriver3);
        consortium.registerObserver(taxiDriver1);
        consortium.registerObserver(taxiDriver2);
        consortium.registerObserver(taxiDriver3);

        consortium.setShopRequest(shop1);

        assertEquals(vanDriver1.getDeliveryRequest().getCustomerName(), "Michael Smith");
        assertEquals(vanDriver2.getDeliveryRequest().getCustomerName(), "Michael Smith");
        assertEquals(vanDriver3.getDeliveryRequest().getCustomerName(), "Michael Smith");
        assertEquals(taxiDriver1.getDeliveryRequest().getCustomerName(), "Michael Smith");
        assertEquals(taxiDriver2.getDeliveryRequest().getCustomerName(), "Michael Smith");
        assertEquals(taxiDriver3.getDeliveryRequest().getCustomerName(), "Michael Smith");
    }

    @Test
    public void testCustomerAddress() {
        consortium.registerObserver(vanDriver1);
        consortium.registerObserver(vanDriver2);
        consortium.registerObserver(vanDriver3);
        consortium.registerObserver(taxiDriver1);
        consortium.registerObserver(taxiDriver2);
        consortium.registerObserver(taxiDriver3);

        consortium.setShopRequest(shop1);

        assertEquals(vanDriver1.getDeliveryRequest().getCustomerAddress(), "123 Pleasant St");
        assertEquals(vanDriver2.getDeliveryRequest().getCustomerAddress(), "123 Pleasant St");
        assertEquals(vanDriver3.getDeliveryRequest().getCustomerAddress(), "123 Pleasant St");
        assertEquals(taxiDriver1.getDeliveryRequest().getCustomerAddress(), "123 Pleasant St");
        assertEquals(taxiDriver2.getDeliveryRequest().getCustomerAddress(), "123 Pleasant St");
        assertEquals(taxiDriver3.getDeliveryRequest().getCustomerAddress(), "123 Pleasant St");
    }

    @Test
    public void testProductToDeliver() {
        consortium.registerObserver(vanDriver1);
        consortium.registerObserver(vanDriver2);
        consortium.registerObserver(vanDriver3);
        consortium.registerObserver(taxiDriver1);
        consortium.registerObserver(taxiDriver2);
        consortium.registerObserver(taxiDriver3);

        consortium.setShopRequest(shop1);

        assertEquals(vanDriver1.getDeliveryRequest().getProductToDeliver(), "Big Mac Cheeseburger");
        assertEquals(vanDriver2.getDeliveryRequest().getProductToDeliver(), "Big Mac Cheeseburger");
        assertEquals(vanDriver3.getDeliveryRequest().getProductToDeliver(), "Big Mac Cheeseburger");
        assertEquals(taxiDriver1.getDeliveryRequest().getProductToDeliver(), "Big Mac Cheeseburger");
        assertEquals(taxiDriver2.getDeliveryRequest().getProductToDeliver(), "Big Mac Cheeseburger");
        assertEquals(taxiDriver3.getDeliveryRequest().getProductToDeliver(), "Big Mac Cheeseburger");
    }
}
