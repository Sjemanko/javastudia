package exercise_3_3.Objects;

import exercise_3_3.BaseClasses.Meal;
import exercise_3_3.Decorators.BaseIngredients.CheeseDecorator;
import exercise_3_3.Decorators.BaseIngredients.TomatoSauceDecorator;

public class ChicagoPizza extends Meal {
    Meal pizza;
    
    public ChicagoPizza(Meal pizza)
    {
        this.pizza = new TomatoSauceDecorator(new CheeseDecorator(pizza));
        description = "Chicago Pizza - " + this.pizza.getDescription();
    }

    @Override
    public double cost() {
        return 24.60;
    }
}
