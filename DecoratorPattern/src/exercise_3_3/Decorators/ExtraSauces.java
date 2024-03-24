package exercise_3_3.Decorators;

import exercise_3_3.BaseClasses.Meal;
import exercise_3_3.BaseClasses.PizzaTopingsDecorator;

public class ExtraSauces extends PizzaTopingsDecorator{
    Meal meal;

    public ExtraSauces(Meal meal)
    {
        this.meal = meal;
    }
    @Override
    public String getDescription() {
        return meal.getDescription() + " + Extra Sauces";
    }

    @Override
    public double cost() {
        return meal.cost() + 8.0;
    }
    
}
