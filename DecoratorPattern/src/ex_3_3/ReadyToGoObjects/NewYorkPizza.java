package ex_3_3.ReadyToGoObjects;

import ex_3_3.BaseClasses.Meal;

public class NewYorkPizza extends Meal {

    public NewYorkPizza()
    {
        description = "New York pizza - (Tomatoes, Mozzarella, Romano Cheese, Oregano, Pepper Flakes)";
    }

    @Override
    public double cost()
    {
        return 95.25;
    }
}
