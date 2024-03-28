package exercise_3_3.Decorators.BaseIngredients;

import exercise_3_3.BaseClasses.Meal;
import exercise_3_3.BaseClasses.PizzaTopingsDecorator;

public class BasilDecorator extends PizzaTopingsDecorator{

    Meal meal;

    public BasilDecorator(Meal meal)
    {
        this.meal = meal;
    }
    
    @Override
    public String getDescription() {
        return this.meal.getDescription() + "Basil, ";
    }

    @Override
    public double cost() {
        return this.meal.cost();
    }
    
}
