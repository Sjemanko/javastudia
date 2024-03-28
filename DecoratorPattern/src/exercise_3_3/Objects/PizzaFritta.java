package exercise_3_3.Objects;

import exercise_3_3.BaseClasses.Meal;
import exercise_3_3.Decorators.BaseIngredients.BasilDecorator;
import exercise_3_3.Decorators.BaseIngredients.CheeseDecorator;
import exercise_3_3.Decorators.BaseIngredients.TomatoesDecorator;

public class PizzaFritta extends Meal {

    Meal pizza;
    public PizzaFritta(Meal pizza)
    {
        this.pizza = new BasilDecorator(new CheeseDecorator(new TomatoesDecorator(pizza)));  
        description = "Pizza Fritta - " + this.pizza.getDescription();
    }

    @Override
    public double cost() {
        return 92.42;
    }
}
