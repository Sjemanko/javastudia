package exercise_1_2_poprawione.classes.shipmentTypes;

import exercise_1_2_poprawione.interfaces.ShipmentInterface;

public class DPDCourier implements ShipmentInterface{

    @Override
    public void send() {
        System.out.println("Sending package by DPD Courier");
    }

}
