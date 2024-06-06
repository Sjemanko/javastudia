package FactoryPattern.exercise_1_2;

public abstract class Stamp {
    protected String name;
    protected Double price;
    protected int deliveryTimeInDays;
    protected String deliveryType;

    void order()
    {
        System.out.println("Ordered stamp: " + name);
        System.out.println("Stamp price: " + price);
        System.out.println("Delivery time (in days): " + deliveryTimeInDays);
        System.out.println("Delivery type: " + deliveryType);
    }
}
