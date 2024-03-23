package ex_3_3.ReadyToGoObjects;

import ex_3_3.BaseClasses.Meal;

public class PizzaFritta extends Meal {

    public PizzaFritta()
    {
        description = "Pizza Fritta - (Tomatoes, Parmesan Cheese, Ricotta Cheese, Basil)";
    }

    @Override
    public double cost() {
        return 92.42;
    }
}
