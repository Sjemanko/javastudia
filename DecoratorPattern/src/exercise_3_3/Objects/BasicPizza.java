package exercise_3_3.Objects;

import exercise_3_3.BaseClasses.Meal;

public class BasicPizza extends Meal{

    public BasicPizza()
    {
        description = "";
    }
    
    @Override
    public double cost() {
        return 0.0;
    }
}
