package exercise_3_3.Decorators.BaseIngredients;

import exercise_3_3.BaseClasses.Meal;
import exercise_3_3.BaseClasses.PizzaTopingsDecorator;

public class TomatoesDecorator extends PizzaTopingsDecorator{

    Meal meal;

    public TomatoesDecorator(Meal meal)
    {
        this.meal = meal;
    }

    @Override
    public String getDescription() {
        return this.meal.getDescription() + "Tomatoes, ";
    }

    @Override
    public double cost() {
        return this.meal.cost();
    }
    
}
