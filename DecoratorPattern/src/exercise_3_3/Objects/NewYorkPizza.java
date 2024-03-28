package exercise_3_3.Objects;

import exercise_3_3.BaseClasses.Meal;
import exercise_3_3.Decorators.BaseIngredients.CheeseDecorator;
import exercise_3_3.Decorators.BaseIngredients.MozzarellaDecorator;
import exercise_3_3.Decorators.BaseIngredients.OreganoDecorator;
import exercise_3_3.Decorators.BaseIngredients.PepperFlakesDecorator;
import exercise_3_3.Decorators.BaseIngredients.TomatoesDecorator;

public class NewYorkPizza extends Meal {

    Meal pizza;

    public NewYorkPizza(Meal pizza)
    {
        this.pizza = new PepperFlakesDecorator(new OreganoDecorator(new CheeseDecorator(new MozzarellaDecorator(new TomatoesDecorator(pizza))))); 
        description = "New York pizza - " + this.pizza.getDescription();

    }

    @Override
    public double cost()
    {
        return 95.25;
    }
}
