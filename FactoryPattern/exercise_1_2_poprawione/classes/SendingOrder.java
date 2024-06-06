package exercise_1_2_poprawione.classes;

import exercise_1_2_poprawione.classes.shipmentTypes.DPDCourier;
import exercise_1_2_poprawione.classes.shipmentTypes.InpostCourier;
import exercise_1_2_poprawione.classes.shipmentTypes.ParcelLocker;
import exercise_1_2_poprawione.interfaces.ShipmentInterface;

public class SendingOrder {
    public ShipmentInterface createOrder(String type) {
        return switch (type)
        {
            case "DPD Courier" -> new DPDCourier();
            case "Inpost Courier" -> new InpostCourier();
            case "Parcel Locker" -> new ParcelLocker();
            default -> null;
        };
    }
}