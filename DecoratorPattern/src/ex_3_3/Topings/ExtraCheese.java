package ex_3_3.Topings;

import ex_3_3.BaseClasses.Meal;
import ex_3_3.BaseClasses.PizzaTopingsDecorator;

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
