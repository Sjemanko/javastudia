package exercise_3_3.Objects;

import exercise_3_3.BaseClasses.Meal;
import exercise_3_3.Decorators.BaseIngredients.MozzarellaDecorator;
import exercise_3_3.Decorators.BaseIngredients.TomatoesDecorator;

public class NeapolitanPizza extends Meal {

    Meal pizza;
    public NeapolitanPizza(Meal pizza)
    {
        this.pizza = new MozzarellaDecorator(new TomatoesDecorator(pizza));
        description = "Neapolitan pizza - " + this.pizza.getDescription();
    }

    @Override
    public double cost() {
        return 120.42;
    }
}
