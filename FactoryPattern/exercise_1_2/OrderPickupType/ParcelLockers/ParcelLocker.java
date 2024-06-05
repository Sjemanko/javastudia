package FactoryPattern.exercise_1_2.OrderPickupType.ParcelLockers;

import FactoryPattern.exercise_1_2.Stamp;
import FactoryPattern.exercise_1_2.StampOrder;

public class ParcelLocker extends StampOrder{

    @Override
    protected Stamp createStampOrder(String orderType){
        return switch (orderType)
        {
            case "Moya Paczkomat" -> new MoyaParcelLocker();
            case "Orlen Paczkomat" -> new OrlenParcelLocker();
            default -> null;
        };
    }

}

