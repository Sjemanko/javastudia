package exercise_3_3.Decorators.BaseIngredients;

import exercise_3_3.BaseClasses.Meal;
import exercise_3_3.BaseClasses.PizzaTopingsDecorator;

public class PepperFlakesDecorator extends PizzaTopingsDecorator{

    Meal meal;

    public PepperFlakesDecorator(Meal meal)
    {
        this.meal = meal;
    }

    @Override
    public String getDescription() {
        return this.meal.getDescription() + "Pepper Flakes, ";
    }

    @Override
    public double cost() {
        return this.meal.cost();
    }
    
}
