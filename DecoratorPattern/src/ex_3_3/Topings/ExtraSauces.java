package ex_3_3.Topings;

import ex_3_3.BaseClasses.Meal;
import ex_3_3.BaseClasses.PizzaTopingsDecorator;

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
