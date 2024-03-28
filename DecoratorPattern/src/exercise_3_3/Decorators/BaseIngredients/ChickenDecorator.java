package exercise_3_3.Decorators.BaseIngredients;

import exercise_3_3.BaseClasses.Meal;
import exercise_3_3.BaseClasses.PizzaTopingsDecorator;

public class ChickenDecorator extends PizzaTopingsDecorator{
    Meal meal;

    public ChickenDecorator(Meal meal)
    {
        this.meal = meal;
    }

    @Override
    public String getDescription() {
       return this.meal.getDescription() + "Chicken, "; 
    }

    @Override
    public double cost() {
        return this.meal.cost();
    }
    
}
