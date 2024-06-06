package FactoryPattern.exercise_1_2.OrderPickupType.SelfCollection;

import FactoryPattern.exercise_1_2.Stamp;
import FactoryPattern.exercise_1_2.StampOrder;

public class SelfCollection extends StampOrder{

    @Override
    protected Stamp createStampOrder(String orderType){
        return switch (orderType)
        {
            case "Odbiór osobisty" -> new SelfCollectionMethod();
            default -> null;
        };
    }
}
