package edu.bu.met.cs665;

import edu.bu.met.cs665.DeliveryApplication.*;

/**
 * Name: Cecilia Chacko
 * Date: 10/03/2022
 * Description: This class simulates the process of sending notifications about delivery requests
 * to drivers. When a shop gets a product delivery order, the order is processed at the shop and
 * a delivery request is broadcast to all the drivers.
 */
public class Main {

    public static void main(String[] args) {

        ShopConsortium consortium = new ShopConsortium();

        //Creating different observers
        Observer vanDriver1 = new Van("John Doe", "S11122233");
        Observer vanDriver2 = new Van("Jane Smith", "S22233344");
        Observer vanDriver3 = new Van("Peter Parker", "S55566678");
        Observer taxiDriver1 = new Taxi("Emily Johns", "S33344456");
        Observer taxiDriver2 = new Taxi("Tom Sawyer", "S44455567");
        Observer taxiDriver3 = new Taxi("Jack Smith", "S66677788");

        //Registering observers
        consortium.registerObserver(vanDriver1);
        consortium.registerObserver(vanDriver2);
        consortium.registerObserver(vanDriver3);
        consortium.registerObserver(taxiDriver1);
        consortium.registerObserver(taxiDriver2);
        consortium.registerObserver(taxiDriver3);

        //Creating different delivery requests
        DeliveryRequest delivery1 = new DeliveryRequest("Michael Smith", "123 Pleasant St",
                "Big Mac Cheeseburger");

        DeliveryRequest delivery2 = new DeliveryRequest("Jane Bennet", "234 Harper Lane",
                "High-Rise Jeans");

        DeliveryRequest delivery3 = new DeliveryRequest("Diana Barry", "364 Summer St",
                "Tales of Beedle and the Bard");

        //Shops processing delivery requests
        Shop shop1 = new Shop("McDonalds", "345 Main St", delivery1);

        Shop shop2 = new Shop("Forever 21", "123 Gloucester St", delivery2);

        Shop shop3 = new Shop("Flourish and Blotts", "345 Diagon Alley N", delivery3);

        //Notification broadcast to all observers
        consortium.setShopRequest(shop1);
        consortium.setShopRequest(shop2);
        consortium.setShopRequest(shop3);


    }


}
