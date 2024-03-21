package ex_3_3.ReadyToGoObjects;

import ex_3_3.BaseClasses.Meal;

public class NeapolitanPizza extends Meal {

    public NeapolitanPizza()
    {
        description = "Neapolitan pizza";
    }

    @Override
    public double cost() {
        return 120.42;
    }
}
