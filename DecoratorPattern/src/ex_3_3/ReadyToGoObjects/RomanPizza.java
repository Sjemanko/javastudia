package ex_3_3.ReadyToGoObjects;

import ex_3_3.BaseClasses.Meal;

public class RomanPizza extends Meal {

    public RomanPizza()
    {
        description = "Roman pizza";
    }

    @Override
    public double cost() {
        return 24.25;
    }
}
