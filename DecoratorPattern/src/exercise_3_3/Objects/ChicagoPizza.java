package exercise_3_3.Objects;

import exercise_3_3.BaseClasses.Meal;

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
