package exercise_3_3.Objects;

import exercise_3_3.BaseClasses.Meal;

public class RomanPizza extends Meal {

    public RomanPizza()
    {
        description = "Roman pizza - (Garlic, Tomatoes, Stracciatella cheese, Basil)";
    }

    @Override
    public double cost() {
        return 24.25;
    }
}
