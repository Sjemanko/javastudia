package exercise_3_3.Decorators.BaseIngredients;

import exercise_3_3.BaseClasses.Meal;
import exercise_3_3.BaseClasses.PizzaTopingsDecorator;

public class OreganoDecorator extends PizzaTopingsDecorator{

    Meal meal;

    public OreganoDecorator(Meal meal)
    {
        this.meal = meal;
    }

    @Override
    public String getDescription() {
        return this.meal.getDescription() + "Oregano, ";
    }

    @Override
    public double cost() {
        return this.meal.cost();
    }
    
}
