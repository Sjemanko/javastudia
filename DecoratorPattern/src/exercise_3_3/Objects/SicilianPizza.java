package exercise_3_3.Objects;

import exercise_3_3.BaseClasses.Meal;
import exercise_3_3.Decorators.BaseIngredients.CheeseDecorator;
import exercise_3_3.Decorators.BaseIngredients.ChickenDecorator;
import exercise_3_3.Decorators.BaseIngredients.PepperoniDecorator;

public class SicilianPizza extends Meal {

    Meal pizza;
    public SicilianPizza(Meal pizza)
    {
        this.pizza = new ChickenDecorator(new CheeseDecorator(new PepperoniDecorator(pizza))); 
        description = "Sicilian pizza - " + this.pizza.getDescription();
    }

    @Override
    public double cost() {
        return 43.26;
    }
}
