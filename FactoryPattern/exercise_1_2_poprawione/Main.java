package exercise_1_2_poprawione;

import exercise_1_2_poprawione.classes.SendingOrder;
import exercise_1_2_poprawione.interfaces.ShipmentInterface;

public class Main {
    public static void main(String[] args) {
        ShipmentInterface order = new SendingOrder().createOrder("Inpost Courier");
        order.send();
        
        System.out.println();

        ShipmentInterface order2 = new SendingOrder().createOrder("Parcel Locker");
        order2.send();
    }
}
