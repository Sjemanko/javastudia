package FactoryPattern.exercise_1_2.OrderPickupType.ParcelLockers;

import FactoryPattern.exercise_1_2.Stamp;

public class OrlenParcelLocker extends Stamp {

    public OrlenParcelLocker(){
        name = "Znaczek od paczkomatu";
        price = 34.99;
        deliveryTimeInDays = 9;
        deliveryType = "Orlen Paczkomat";
    }
}
