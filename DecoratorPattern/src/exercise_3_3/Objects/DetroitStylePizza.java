package exercise_3_3.Objects;

import exercise_3_3.BaseClasses.Meal;

public class DetroitStylePizza extends Meal {

     DetroitStylePizza()
    {
        description = "Detroit-style pizza - (Cheese, Pepperoni, Sauce)";
    }

    @Override
    public double cost() {
        return 50.25;
    }
}
