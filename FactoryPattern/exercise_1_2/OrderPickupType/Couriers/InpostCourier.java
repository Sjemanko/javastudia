package FactoryPattern.exercise_1_2.OrderPickupType.Couriers;

import FactoryPattern.exercise_1_2.Stamp;

public class InpostCourier extends Stamp {
    public InpostCourier(){
        name = "Znaczek od kuriera";
        price = 14.99;
        deliveryTimeInDays = 2;
        deliveryType = "Inpost kurier";
    }
}
