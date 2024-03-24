package exercise_3_3.Objects;

import exercise_3_3.BaseClasses.Meal;

public class NeapolitanPizza extends Meal {

    public NeapolitanPizza()
    {
        description = "Neapolitan pizza - (Tomatoes, Mozzarella)";
    }

    @Override
    public double cost() {
        return 120.42;
    }
}
