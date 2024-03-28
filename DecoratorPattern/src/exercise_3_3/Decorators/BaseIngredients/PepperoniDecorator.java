package exercise_3_3.Decorators.BaseIngredients;

import exercise_3_3.BaseClasses.Meal;
import exercise_3_3.BaseClasses.PizzaTopingsDecorator;

public class PepperoniDecorator extends PizzaTopingsDecorator{

    Meal meal;

    public PepperoniDecorator(Meal meal)
    {
        this.meal = meal;
    }
    
    public String getDescription()
    {
        return this.meal.getDescription() + "Pepperoni, ";
    } 

    @Override
    public double cost() {
        return this.meal.cost();
    }
    
}
