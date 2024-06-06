package exercise_1_2_poprawione.classes.shipmentTypes;

import exercise_1_2_poprawione.interfaces.ShipmentInterface;

public class ParcelLocker implements ShipmentInterface{

    @Override
    public void send() {
        System.out.println("Sending package to Parcel Locker ");
    }
    
}
