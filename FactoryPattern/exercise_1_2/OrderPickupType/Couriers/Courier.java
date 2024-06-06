package FactoryPattern.exercise_1_2.OrderPickupType.Couriers;

import FactoryPattern.exercise_1_2.Stamp;
import FactoryPattern.exercise_1_2.StampOrder;

public class Courier extends StampOrder{

    @Override
    protected Stamp createStampOrder(String orderType){
        return switch (orderType)
        {
            case "InPost" -> new InpostCourier();
            case "DPDCourier" -> new DPDCourier();
            default -> null;
        };
    }

}
