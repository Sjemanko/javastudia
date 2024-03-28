package exercise_3_3.Objects;

import exercise_3_3.BaseClasses.Meal;
import exercise_3_3.Decorators.BaseIngredients.CheeseDecorator;
import exercise_3_3.Decorators.BaseIngredients.PepperoniDecorator;
import exercise_3_3.Decorators.BaseIngredients.TomatoSauceDecorator;

public class DetroitStylePizza extends Meal {

    Meal pizza;
    public DetroitStylePizza(Meal pizza)
    {
        this.pizza = new CheeseDecorator(new PepperoniDecorator(new TomatoSauceDecorator(pizza)));
        description = "Detroit-style pizza - " + this.pizza.getDescription(); 
    }

    @Override
    public double cost() {
        return 50.25;
    }
}
