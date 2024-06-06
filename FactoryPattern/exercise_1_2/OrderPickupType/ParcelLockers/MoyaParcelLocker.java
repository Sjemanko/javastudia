package FactoryPattern.exercise_1_2.OrderPickupType.ParcelLockers;

import FactoryPattern.exercise_1_2.Stamp;

public class MoyaParcelLocker extends Stamp{

    public MoyaParcelLocker(){
        name = "Znaczek od paczkomatu";
        price = 49.99;
        deliveryTimeInDays = 4;
        deliveryType = "Moya Paczkomat";
    }
}
