package FactoryPattern.exercise_1_2;

import FactoryPattern.exercise_1_2.OrderPickupType.Couriers.Courier;
import FactoryPattern.exercise_1_2.OrderPickupType.ParcelLockers.ParcelLocker;
import FactoryPattern.exercise_1_2.OrderPickupType.SelfCollection.SelfCollection;

public class Main {

    public static void main(String[] args)
    {
        StampOrder parcelLocker = new ParcelLocker();

        Stamp stamp = parcelLocker.orderStamp("Moya Paczkomat");

        System.out.println();

        StampOrder courier = new Courier();
        Stamp stamp2 = courier.orderStamp("InPost");

        System.out.println(); 

        StampOrder selfCollection = new SelfCollection();
        Stamp stamp3 = selfCollection.orderStamp("Odbiór osobisty");
    }
}
