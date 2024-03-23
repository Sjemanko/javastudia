package ex_3_3.Topings;

import ex_3_3.BaseClasses.Meal;
import ex_3_3.BaseClasses.PizzaTopingsDecorator;

public class RemoveTopping extends PizzaTopingsDecorator{
    Meal meal;
    String toppingToRemove;

    public RemoveTopping(Meal meal, String topping)
    {
        this.meal = meal;
        this.toppingToRemove = topping;
    }

    @Override
    public String getDescription() {
        String description = meal.getDescription();
        if(description.contains(description.toString()))
        {
            description = description.replace(toppingToRemove,"");
        }
        return description;
    }

    @Override
    public double cost() {
        return meal.cost(); 
    }
    
}
