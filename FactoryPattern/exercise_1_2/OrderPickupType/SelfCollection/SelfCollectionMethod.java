package FactoryPattern.exercise_1_2.OrderPickupType.SelfCollection;

import FactoryPattern.exercise_1_2.Stamp;

public class SelfCollectionMethod extends Stamp {

    public SelfCollectionMethod(){
        name = "Znaczek kupiony na miejscu";
        price = 0.0;
        deliveryTimeInDays = 0;
        deliveryType = "Odbiór osobisty";
    }
}
