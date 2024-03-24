package exercise_3_3.Decorators;

import exercise_3_3.BaseClasses.Meal;
import exercise_3_3.BaseClasses.PizzaTopingsDecorator;

public class ExtraCheese extends PizzaTopingsDecorator{
    Meal meal;
    
    public ExtraCheese(Meal meal)
    {
        this.meal = meal;
    }
    
    @Override
    public String getDescription() {
       return meal.getDescription() + " + Extra Cheese";
    }

    @Override
    public double cost() {
        return meal.cost() + 4.2; 
    }
    
    
}
