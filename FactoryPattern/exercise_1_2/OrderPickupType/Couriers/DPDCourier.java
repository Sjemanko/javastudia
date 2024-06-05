package FactoryPattern.exercise_1_2.OrderPickupType.Couriers;

import FactoryPattern.exercise_1_2.Stamp;

public class DPDCourier extends Stamp{
    public DPDCourier() {
        name = "Znaczek od kuriera";
        price = 9.99;
        deliveryTimeInDays = 5;
        deliveryType = "DPD kurier";
    }

}
