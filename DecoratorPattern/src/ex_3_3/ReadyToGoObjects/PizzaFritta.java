package ex_3_3.ReadyToGoObjects;

import ex_3_3.BaseClasses.Meal;

public class PizzaFritta extends Meal {

    public PizzaFritta()
    {
        description = "Pizza Fritta";
    }

    @Override
    public double cost() {
        return 92.42;
    }
}
