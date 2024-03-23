package ex_3_3.ReadyToGoObjects;

import ex_3_3.BaseClasses.Meal;

public class SicilianPizza extends Meal {

    public SicilianPizza()
    {
        description = "Sicilian pizza - (Pepperoni, Cheese, Chicken)";
    }

    @Override
    public double cost() {
        return 43.26;
    }
}
