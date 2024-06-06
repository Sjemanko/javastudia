package FactoryPattern.exercise_1_2;

public abstract class StampOrder {
    protected abstract Stamp createStampOrder(String orderType);

    public Stamp orderStamp(String orderType)
    {
        Stamp stamp = createStampOrder(orderType);
        System.out.println("Your stamp product: " + stamp.name);
        stamp.order();
        return stamp;
    }
}
