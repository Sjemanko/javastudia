package exercise_3_3.Objects;

import exercise_3_3.BaseClasses.Meal;
import exercise_3_3.Decorators.BaseIngredients.BasilDecorator;
import exercise_3_3.Decorators.BaseIngredients.CheeseDecorator;
import exercise_3_3.Decorators.BaseIngredients.GarlicDecorator;
import exercise_3_3.Decorators.BaseIngredients.TomatoesDecorator;

public class RomanPizza extends Meal {

    Meal pizza;
    public RomanPizza(Meal pizza)
    {
        this.pizza = new BasilDecorator(new CheeseDecorator(new TomatoesDecorator(new GarlicDecorator(pizza)))); 
        description = "Roman pizza - " + this.pizza.getDescription();
    }

    @Override
    public double cost() {
        return 24.25;
    }
}
