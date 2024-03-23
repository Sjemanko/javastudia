package ex_3_3.ReadyToGoObjects;

import ex_3_3.BaseClasses.Meal;

public class ChicagoPizza extends Meal {

    public ChicagoPizza()
    {
        description = "Chicago Pizza - (Cheese, Tomato Sauce)";
    }

    @Override
    public double cost() {
        return 24.60;
    }
}
